package by.iba.garukin.run;

import static by.iba.garukin.model.DirectionEnum.*;
import by.iba.garukin.action.Controller;
import by.iba.garukin.model.Field;
import by.iba.garukin.model.VacuumCleaner;

/**
 * Class for the running app
 * 
 * @author Aleksey Garukin
 *
 */
public class Runner {

	public static void main(String[] args) {
		
		Field field = new Field(90, 90);

		VacuumCleaner vc1 = new VacuumCleaner("Number 1", 8, 12, N, "4FRFR4FLFL4F");
		VacuumCleaner vc2 = new VacuumCleaner("Number 2", 30, 24, S, "4FR4FR4FR4FR");

		Controller.printPositionsWithDirection(vc1, field);
		Controller.printPositionsWithDirection(vc2, field);

	}

}