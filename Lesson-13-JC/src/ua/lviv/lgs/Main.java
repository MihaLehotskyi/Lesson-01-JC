package ua.lviv.lgs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
public static void main(String[] args) {
	
	System.out.println("Sorting by name and age: ");
	System.out.println();
	TreeSet<Person> set = new TreeSet<>(new Comporator());
	
	set.add(new Person("Nazar",25));
	set.add(new Person("Natali",37));
	set.add(new Person("Andrew",12));
	set.add(new Person("Mark",22));
	set.add(new Person("Vasyl",48));
	
	for (Person person : set) {
		System.out.println(person);
	}
	
	System.out.println();
	System.out.println("Sorting by name: ");
	System.out.println();
	TreeSet<Person> set1 = new TreeSet<>();
	
	set1.add(new Person("Nazar",25));
	set1.add(new Person("Natali",37));
	set1.add(new Person("Andrew",12));
	set1.add(new Person("Mark",22));
	set1.add(new Person("Vasyl",48));
	
	for (Person person : set1) {
		System.out.println(person);
	}
	
	System.out.println();
	System.out.println("Sorting by age: ");
	System.out.println();
	TreeSet<Person> set2 = new TreeSet<>(new ComporatorAge());
	
	set2.add(new Person("Nazar",25));
	set2.add(new Person("Natali",37));
	set2.add(new Person("Andrew",12));
	set2.add(new Person("Mark",22));
	set2.add(new Person("Vasyl",48));
	
	for (Person person : set2) {
		System.out.println(person);
	}
}
}
