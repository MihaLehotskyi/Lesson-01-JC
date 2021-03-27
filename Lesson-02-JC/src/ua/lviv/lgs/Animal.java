package ua.lviv.lgs;

public class Animal {

		private String type;
		private String name;
		private int age;
		private String color;
		
		
		Animal(){
			this.type = "Gorila";
		}
		
		Animal(int age){
			this.age = age;
		}
		
		Animal(String type, String name, int age, String color){
			this.type = type;
			this.name = name;
			this.age = age;
			this.color = color;
		}
		
		public void scream() {
			System.out.println("Monkey screams!");
		}
		
		@Override
		public String toString() {
			return "Animal [ type=" + type + ", name=" + name + ", age=" + age + ", color=" + color + "]";
		}
}
