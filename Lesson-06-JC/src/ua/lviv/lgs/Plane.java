package ua.lviv.lgs;

public abstract class Plane {
	private int width;
	private int length;
	private int weight;
	
	
	
	public Plane(int width, int length, int weight) {
		this.width = width;
		this.length = length;
		this.weight = weight;
	}
	void StartEngine() {
		System.out.println("Time left = "+(int)(20 + Math.random() * 60)+" seconds");
	}
	void FlyStart() {
		System.out.println("Distance = " + (double)(Math.random() * 1000)+" km");
	}
	void FlightEnd() {
		System.out.println("The plain is landing...");
	}
}
