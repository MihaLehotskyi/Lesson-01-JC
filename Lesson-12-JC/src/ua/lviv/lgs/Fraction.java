package ua.lviv.lgs;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction {
	
	List Fraction = new ArrayList();
	
	void addDeputy() {
		System.out.println("Enter weight:");
		Scanner sc1 = new Scanner(System.in);
		int weight = sc1.nextInt();
		System.out.println("Enter height:");
		Scanner sc2 = new Scanner(System.in);
		int height = sc2.nextInt();
		System.out.println("Enter firstname:");
		Scanner sc3 = new Scanner(System.in);
		String firstname = sc3.next();
		System.out.println("Enter secondname:");
		Scanner sc4 = new Scanner(System.in);
		String secondname = sc4.next();
		System.out.println("Enter age:");
		Scanner sc5 = new Scanner(System.in);
		int age = sc5.nextInt();
		System.out.println("Enter grafter:");
		Scanner sc6 = new Scanner(System.in);
		boolean grafter = sc6.nextBoolean();
		Fraction.add(new Deputy(weight, height, firstname, secondname, age, grafter));
		System.out.println(Fraction);
	}
	
	void showDeputy() {
		for (int i = 0; i < Fraction.size(); i++) {
			System.out.println(Fraction.get(i));
		}
	}
	void removeAllDeputy() {
		for (int i = 0; i < Fraction.size(); i++) {
			System.out.println(Fraction.remove(i));
		}
	}
	void removeDeputy(int i) {
		Fraction.remove(i);
	}
	void showGrafters() {
		for (int i = 0; i < Fraction.size(); i++) {
			if (((Deputy) Fraction.get(i)).isGrafter()) {
				System.out.println(Fraction.get(i));
			}
		}
	}
	void GiveGraft(int i) {
		Scanner sc = new Scanner(System.in);
		int setGraftvalue = sc.nextInt();
		if (((Deputy) Fraction.get(i)).isGrafter() == false) {
			System.out.println("This deputy is not a grafter!");
		} else {
			if(setGraftvalue > 5000) {
				System.out.println("Police will arrest that deputy!");
			} else {
				System.out.println(setGraftvalue);
				((Deputy) Fraction.get(i)).setGraftvalue(setGraftvalue);
			}
		}
	}
	
	void MaxGraft() {
		int MaxVal = 0;
		int maxIndex = 0;
		for (int i = 0; i < Fraction.size(); i++) {
		 if(MaxVal <= ((Deputy) Fraction.get(i)).getGraftvalue()) {
			 MaxVal = ((Deputy) Fraction.get(i)).getGraftvalue(); 
			 maxIndex = i;
		 }
		} System.out.println(Fraction.get(maxIndex));
	}
	

	@Override
	public String toString() {
		return "Fraction [Fraction=" + Fraction + "]";
	}


	
	
	
}
