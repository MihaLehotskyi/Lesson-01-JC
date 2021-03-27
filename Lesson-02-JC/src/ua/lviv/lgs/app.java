package ua.lviv.lgs;

public class app {
	public static void main(String[] args) {
		
		Rectangle a1 = new Rectangle();
		
		Rectangle a2 = new Rectangle(25,25);
		
		
		System.out.println(a1);
		
		System.out.println("Периметр прямокутника = "+a1.getPerimetr());
		System.out.println("Площа прямокутника = "+a1.getSquare());
		
		System.out.println(a2);
		
		System.out.println("Периметр прямокутника = "+a2.getPerimetr());
		System.out.println("Площа прямокутника = "+a2.getSquare());
		
		Kolo a3 = new Kolo(5.0,10.0);
		
		System.out.println(a3);
		
		System.out.println("Довжина кола = "+a3.getLength());
		System.out.println("Площа кола = "+a3.getSquare());
		
	}
}
