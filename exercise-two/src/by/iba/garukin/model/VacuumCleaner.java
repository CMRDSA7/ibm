package by.iba.garukin.model;

/**
 * Vacuum cleaner class
 * 
 * @author Aleksey Garukin
 *
 */
public class VacuumCleaner {
	private String name;
	private int x;
	private int y;
	private DirectionEnum direction;
	private String way;

	public VacuumCleaner() {
	}

	public VacuumCleaner(String name, int x, int y, DirectionEnum direction, String way) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.way = way;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void addToX(int value) {
		this.x += value;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void addToY(int value) {
		this.y += value;
	}

	public DirectionEnum getDirection() {
		return direction;
	}

	public void setDirection(DirectionEnum direction) {
		this.direction = direction;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return x + " " + y + " " + direction;
	}
	
	
	
}
