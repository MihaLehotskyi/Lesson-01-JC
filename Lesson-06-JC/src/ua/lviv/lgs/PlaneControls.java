package ua.lviv.lgs;

public class PlaneControls extends Plane{
	public PlaneControls(int width, int length, int weight) {
		super(width, length, weight);
	}
	void MoveUp() {
		System.out.println("Plain moves up on: "+(int)(Math.random() * 100)+" km");
	}
	void MoveDown() {
		System.out.println("Plain moves down on: "+(int)(Math.random() * 100)+" km");
	}
	void MoveLeft() {
		System.out.println("Plain moves left on: "+(int)(Math.random() * 100)+" km");
	}
	void MoveRight() {
		System.out.println("Plain moves right on: "+(int)(Math.random() * 100)+" km");
	}
}
