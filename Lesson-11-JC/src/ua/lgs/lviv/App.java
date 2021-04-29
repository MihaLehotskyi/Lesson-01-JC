package ua.lgs.lviv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
	static void menu() {
		System.out.println("Press 1 to see array");
		System.out.println("Press 2 to fill array");
	}

	public static void main(String[] args) {
		// Task 2
		Scanner sc = new Scanner(System.in);
		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				
				int value1 = randomVal(1, 5);
				int value2 = randomVal(1, 5);
				
				List array= new ArrayList();

				for (int i = 0; i < value1; i++) {
					for (int j = 0; j < value2; j++) {
						array.add(new Auto(randomVal(100, 200), randomVal(1980, 2010)));
					}
				}

				System.out.println(array);
				break;
			}
			case "2": {
				int value1 = randomVal(1, 5);
				int value2 = randomVal(1, 5);

				List array= new ArrayList();

				for (int i = 0; i < value1; i++) {
					for (int j = 0; j < value2; j++) {
						array.add(new Auto(150, 1995));
					}
				}
				System.out.println(array);
				break;
			}
			}
		}
	}

	public static int randomVal(int min, int max) {
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

}
