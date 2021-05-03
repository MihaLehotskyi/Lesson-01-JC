package ua.lviv.lgs;

import java.util.Scanner;

public class Deputy extends Person {

	String firstname;
	String secondname;
	int age;
	boolean grafter;
	int graftvalue;
	
	public Deputy(int weight, int height, String firstname, String secondname, int age,boolean grafter) {
		super(weight, height);
		this.firstname = firstname;
		this.secondname = secondname;
		this.age = age;
		this.grafter = grafter;
		this.graftvalue = graftvalue;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGrafter() {
		return grafter;
	}

	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}

	public int getGraftvalue() {
		return graftvalue;
	}

	public void setGraftvalue(int graftvalue) {
		this.graftvalue = graftvalue;
	}

	@Override
	public String toString() {
		return "Deputy [firstname=" + firstname + ", secondname=" + secondname + ", age=" + age + ", grafter=" + grafter
				+ ", graftvalue=" + graftvalue + ", weight=" + weight + ", height=" + height + "]";
	}

	
	
	
	
	
}

	


