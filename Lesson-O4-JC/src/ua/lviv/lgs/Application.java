package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.voice();
		Dog d = new Dog();
		d.voice();
		Cow c1 = new Cow();
		c1.voice();
		Frog f = new Frog();
		System.out.println("");
		f.eat();
		f.sleep();
		f.walk();
		f.swim();
	}
}
