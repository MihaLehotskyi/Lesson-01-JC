package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static void menu() {
		System.out.println("Press 1 to add fraction");
		System.out.println("Press 2 to delete fraction");
		System.out.println("Press 3 to show all fractions");
		System.out.println("Press 4 to clear fraction");
		System.out.println("Press 5 to show fraction");
		System.out.println("Press 6 to add deputy to the fraction");
		System.out.println("Press 7 to remove deputy from the fraction");
		System.out.println("Press 8 to show grafters");
		System.out.println("Press 9 to show the biggest grafter");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fraction f = new Fraction();
		VerkhovnaRada v = new VerkhovnaRada();
		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				v.AddFraction();
				break;
			}
			case "2": {
				System.out.println("Enter the number of fraction you want to delete");
				Scanner sc1 = new Scanner(System.in);
				int rf = sc1.nextInt();
				v.RemoveFraction(rf);
				break;
			}
			case "3": {
				v.showFractions();
				break;
			}
			case "4": {
				System.out.println("Enter the number of fraction you want to clear");
				Scanner sc2 = new Scanner(System.in);
				int rd = sc2.nextInt();
				v.removeDeputies(rd);
				break;
			}
			case "5": {
				System.out.println("Enter the number of fraction you want to show");
				Scanner sc3 = new Scanner(System.in);
				int sf = sc3.nextInt();
				v.getFraction(sf);
				break;
			}
			case "6": {
				System.out.println("Enter the number of fraction you want to add a deputy");
				Scanner sc4 = new Scanner(System.in);
				int ad = sc4.nextInt();
				v.addDeputy(ad);
				break;
			}
			case "7": {
				System.out.println("Enter the number of fraction you want to remove a deputy from");
				Scanner sc5 = new Scanner(System.in);
				int rd = sc5.nextInt();
				v.removeDeputy(rd);
				break;
			}
			case "8": {
				v.getAllGrafters();
				break;
			}
			case "9": {
				v.getTheBiggestGrafter();
				break;
			}
			}
			}
		}
	}

