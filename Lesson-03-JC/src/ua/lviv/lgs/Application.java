package ua.lviv.lgs;

import java.nio.charset.IllegalCharsetNameException;

public class Application {
	public static void main(String[] args) {
		Robot r = new Robot("я Robot Ц € просто працюю");
		
		System.out.println(r);
		
		CoffeRobot r1 = new CoffeRobot("я CoffeRobot Ц € варю каву");
		
		System.out.println(r1);
		
		RobotDancer r2 = new RobotDancer("я RobotDancer Ц € просто танцюю");
		
		System.out.println(r2);
		
		RobotCoocker r3 = new RobotCoocker("я RobotCoocker Ц € просто готую");
		
		System.out.println(r3);
		
		String [] robots  = new String[4];

		robots[0] = r.getWork(); 
		robots[1] = r1.getWork(); 
		robots[2] = r2.getWork(); 
		robots[3] = r3.getWork(); 
		
		for (int i = 0; i < 4; i++){
		    System.out.println( robots[i]);
		
		}
	
		Animal a = new Animal("Leopard", 20, 7);
		
		System.out.println("Name of the animal = " + a.getName() + ", Speed of the animal = " + a.getSpeed() + " km/h, age =  " + a.getAge() +" years old");
		
		a.setName("Bull");
		a.setSpeed(2);
		a.setAge(14);
		
		System.out.println("Name of the animal = " + a.getName() + ", Speed of the animal = " + a.getSpeed() + " km/h, age =  " + a.getAge() +" years old");
	}

	
	
	
}
