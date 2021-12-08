package by.iba.garukin.model;

/**
 * Field class
 * 
 * @author Aleksey Garukin
 *
 */
public class Field {

	private int sizeX;
	private int sizeY;

	public Field() {
	}

	public Field(int sizeX, int sizeY) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}

	public int getSizeX() {
		return sizeX;
	}
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	public int getSizeY() {
		return sizeY;
	}
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

}
