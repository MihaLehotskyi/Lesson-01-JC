package ua.lviv.lgs;

public class Person {
	@MyFirstAnnotation(params ="Here is person's name")
	private String name;
	@MyFirstAnnotation(params ="Here is person's age")
	private int age;
	@MyFirstAnnotation(params ="Here is person's gender")
	private boolean isMan;
	private int weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMan() {
		return isMan;
	}
	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isMan=" + isMan + "]";
	}
	public Person(String name, int age, boolean isMan) {
		super();
		this.name = name;
		this.age = age;
		this.isMan = isMan;
	}
}
