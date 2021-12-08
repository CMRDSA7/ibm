package by.iba.garukin.action;

import by.iba.garukin.model.ChangeDirectionEnum;
import by.iba.garukin.model.Field;
import by.iba.garukin.model.VacuumCleaner;

/**
 * Interface for the working with Vacuum cleaner
 * 
 * @author Aleksey Garukin
 *
 */
public interface Controller {

	public static void printPositionsWithDirection(VacuumCleaner vc,
			Field field) {

		int multiplier = 1;
		for (char ch : vc.getWay().toCharArray()) {
			if (Character.isDigit(ch)) {
				multiplier = Character.getNumericValue(ch);
			} else {
				vc.setDirection(ChangeDirectionEnum
						.valueOf(vc.getDirection() + "" + ch).getDirection());

				changeCoordinates(vc, multiplier);

				// reset multiplier to 1
				multiplier = 1;

				if (!isInFrameworkOfField(vc.getX(), vc.getY(), field)) {
					System.out.println("Vacuum cleaner " + vc.getName()
							+ " exceeds the field");
					return;
				}
			}
		}
		System.out.println(vc);
	}

	private static boolean isInFrameworkOfField(int x, int y, Field field) {
		return x <= field.getSizeX() && x >= 0 && y <= field.getSizeY()
				&& y >= 0;
	}

	public static void changeCoordinates(VacuumCleaner vc, int multiplier) {
		switch (vc.getDirection()) {
			case N : {
				vc.addToY(multiplier);
				break;
			}
			case E : {
				vc.addToX(multiplier);
				break;
			}
			case S : {
				vc.addToY(-multiplier);
				break;
			}
			case W : {
				vc.addToX(-multiplier);
				break;
			}
			default : {
				// no changes for the x and y
			}
		}
	}
}
