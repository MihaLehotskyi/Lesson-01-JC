package ua.lviv.lgs;

public class Main {
	public static void main(String[] args) {
		Cy27 c = new Cy27("Red",300,40,100,10000);
		c.StartEngine();
		c.FlyStart();
		c.MoveUp();
		c.MoveDown();
		c.MoveLeft();
		c.MoveRight();
		c.Stales();
		c.NuclearStrike();
		c.Turbo();
		c.FlightEnd();
	}
}
