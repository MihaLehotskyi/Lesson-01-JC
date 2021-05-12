package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {

	Map<Person, List<Animal>> map;

	public ZooClub(Map<Person, List<Animal>> map) {
		super();
		this.map = map;
	}

	public Map<Person, List<Animal>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Animal>> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "ZooClub [map=" + map + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
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
		ZooClub other = (ZooClub) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}

	void addHuman() {
		System.out.println("Enter name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Enter age:");
		Scanner sc1 = new Scanner(System.in);
		int age = sc1.nextInt();
		map.put(new Person(name, age), new ArrayList<>());
	}

	void addAnimal() {
		System.out.println("Enter type:");
		Scanner sc = new Scanner(System.in);
		String type = sc.nextLine();
		System.out.println("Enter name:");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();
		System.out.println("Enter Person name:");
		Scanner sc2 = new Scanner(System.in);
		String value = sc2.nextLine();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().name.equalsIgnoreCase(value)) {
				List<Animal> value1 = next.getValue();
				value1.add(new Animal(type, name));
				next.setValue(value1);
			}
		}
	}

	void deleteAnimal() {
		System.out.println("Enter Person name:");
		Scanner sc2 = new Scanner(System.in);
		String value = sc2.nextLine();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().name.equalsIgnoreCase(value)) {
				List<Animal> value1 = next.getValue();
				value1.clear();
				next.setValue(value1);
			}
		}
	}

	void deletePerson() {
		System.out.println("Enter Person name:");
		Scanner sc2 = new Scanner(System.in);
		String value = sc2.nextLine();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().name.equalsIgnoreCase(value)) {
				Person p = next.getKey();
				List<Animal> value1 = next.getValue();
				map.remove(p, value1);
			}
		}
	}

	void deleteAnimals() {
		System.out.println("Enter Animal index:");
		Scanner sc2 = new Scanner(System.in);
		int value = sc2.nextInt();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			List<Animal> value1 = next.getValue();
			value1.remove(value);
			next.setValue(value1);
		}
	}
}
