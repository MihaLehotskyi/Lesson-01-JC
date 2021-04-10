package ua.lviv.lgs;

public class Cy27 extends PlaneControls implements ExtraAbilities{
	
	int maxSpeed;
	String color;

	public Cy27(String color, int maxSpeed, int width, int length, int weight) {
		super(width, length, weight);
		this.maxSpeed = maxSpeed;	
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}



	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	@Override
	public void Turbo() {
		System.out.println("Turbo = " + (getMaxSpeed()+(int)(Math.random() * 100)) +" km/h");
		
	}

	@Override
	public void Stales() {
		System.out.println("The plane is unvisible for: "+(Math.random() * 100)+" minutes");
		
	}

	@Override
	public void NuclearStrike() {
		System.out.println("Number of strikes = "+ (int)(Math.random() * 10));
		
	}

}
