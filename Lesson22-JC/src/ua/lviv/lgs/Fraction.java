package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fraction {
	
List<Deputy> Fraction = new ArrayList();
	
	

	public Fraction(ArrayList arrayList) {
}

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
		Deputy d = new Deputy(weight, height, firstname, secondname, age, grafter);
		Fraction.add(d);
		if (grafter == true) {
			System.out.println("Enter graft value:");
			Scanner sc7 = new Scanner(System.in);
			int graft = sc7.nextInt();
			d.giveGraft(graft);
		}
	}
	
	void showDeputy() {
			Fraction.forEach(System.out::println);
	}
	void removeAllDeputy() {
			System.out.println(Fraction.removeAll(Fraction));
		
	}
	void removeDeputy(int i) {
		Fraction.remove(i);
	}
	void showGrafters() {
		Collection<Deputy> coll = new ArrayList();
		for (int i = 0; i < Fraction.size(); i++) {
			if (((Deputy) Fraction.get(i)).isGrafter()) {
				coll.add(Fraction.get(i));
			}
		}
		coll.forEach(System.out::println);
	}
	
	
	void MaxGraft() {
		Collection<Integer> coll = new ArrayList();
		for (int i = 0; i < Fraction.size(); i++) {
			if (((Deputy) Fraction.get(i)).isGrafter()) {
				coll.add(Fraction.get(i).getGraftvalue());
			}
		}
		Integer max = coll.stream().max(Integer::compareTo).get();
		for (int i = 0; i < Fraction.size(); i++) {
			if (((Deputy) Fraction.get(i)).isGrafter() && Fraction.get(i).getGraftvalue() == max) {
				System.out.println(Fraction.get(i));
			}
		}
	}
	

	@Override
	public String toString() {
		return "Fraction [Fraction=" + Fraction + "]";
	}
}
