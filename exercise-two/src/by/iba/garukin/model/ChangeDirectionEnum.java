package by.iba.garukin.model;

import static by.iba.garukin.model.DirectionEnum.*;

/**
 * Change directions class
 * 
 * @author Aleksey Garukin
 *
 */
public enum ChangeDirectionEnum {
	NR(E), NL(W), NF(N), 
	ER(S), EL(N), EF(E), 
	SR(W), SL(E), SF(S), 
	WR(N), WL(S), WF(W);

	private DirectionEnum direction;

	ChangeDirectionEnum(DirectionEnum direction) {
		this.direction = direction;
	}

	public DirectionEnum getDirection() {
		return this.direction;
	}
}
