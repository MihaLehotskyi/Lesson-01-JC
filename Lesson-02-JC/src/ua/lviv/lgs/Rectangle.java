package ua.lviv.lgs;

public class Rectangle {
		
	private int height;
	private int width;
	private int perimetr;
	private int square;
	
	Rectangle(){
		this.height = 25;
		this.width = 10;
		this.perimetr = (width + height)*2;
		this.square = width * height;
	}
	
	Rectangle(int height, int width){
		this.height = height;
		this.width = width;
		this.perimetr = (width + height)*2;
		this.square = width * height;
	}
	
	public int getPerimetr() {
		return perimetr;
	}

	public void setPerimetr(int perimetr) {
		this.perimetr = perimetr;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	@Override
	public String toString() {
		return "Rectangle [ height=" + height + ", width=" + width + "]";
	}
}
