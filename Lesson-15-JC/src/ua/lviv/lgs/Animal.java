package ua.lviv.lgs;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Animal implements Serializable{
	public String type;
	public int age;
	private String voice = "Woof";
	public Animal() {
		super();
	}
	public Animal(String type) {
		super();
		this.type = type;
	}
	public Animal(String type, int age) {
		super();
		this.type = type;
		this.age = age;
		this.voice = voice;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", voice=" + voice + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	public void myMethod(String voice){
		System.out.println(voice);
	}
	public void myMethod(String voice, int times){
		for (int i = 0; i < times; i++) {
			System.out.println(voice);
		}
	}
}
