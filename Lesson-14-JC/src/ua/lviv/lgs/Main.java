package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println("Press 1 to add Person");
		System.out.println("Press 2 to add Animal to the Person");
		System.out.println("Press 3 to delete all Animals from the Person");
		System.out.println("Press 4 to delete Person");
		System.out.println("Press 5 to delete Animals with same index");
		System.out.println("Press 6 show Zooclub");
		System.out.println("Press 7 to Exit program");
	}

	public static void main(String[] args) {

		ZooClub zc = new ZooClub(new HashMap<>());

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				zc.addHuman();
			}
				break;
			case "2": {
				zc.addAnimal();
			}
				break;

			case "3": {
				zc.deleteAnimal();
			}
				break;
			case "4": {
				zc.deletePerson();
			}
				break;
			case "5": {
				zc.deleteAnimals();
			}
				break;
			case "6": {
				System.out.println(zc.map);
			}
				break;
			case "7": {
				System.exit(0);
			}
				break;

			}
		}
	}
}