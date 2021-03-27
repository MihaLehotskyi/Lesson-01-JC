package ua.lviv.lgs;

public class Kolo {
		final double Pi = 3.1415926536;
		private double radius;
		private double diametr;
		private double length;
		private double square;
		
	Kolo(double radius, double diametr) {
		this.radius = radius;
		this.diametr = diametr;
		this.length = 2 * Pi * radius;
		this.square = Pi / 4 * diametr * diametr;
			
	}
		
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	@Override
	public String toString() {
		return "Kolo [ radius=" + radius + ", diametr=" + diametr + "]";
	}
}

