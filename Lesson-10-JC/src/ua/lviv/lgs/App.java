package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class App {
	static void menu() {
		System.out.println("Press 1 to see array");
		System.out.println("Press 2 to fill array");
	}

	public static void main(String[] args) {
		// Task 1
		Integer[] array = new Integer[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = randomVal(1, 60);
		}

		System.out.println("Array with random values");
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(array));
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Sorted reverse array");
		System.out.println(Arrays.toString(array));

		// Task 2
		Scanner sc = new Scanner(System.in);
		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {

				int value1 = randomVal(1, 5);
				int value2 = randomVal(1, 5);

				Auto[][] array1 = new Auto[value1][value2];

				for (int i = 0; i < value1; i++) {
					for (int j = 0; j < value2; j++) {
						array1[i][j] = new Auto(randomVal(100, 200), randomVal(1980, 2010));
					}
				}

				System.out.println(Arrays.deepToString(array1));
				break;
			}
			case "2": {
				int value1 = randomVal(1, 5);
				int value2 = randomVal(1, 5);

				Auto[][] array1 = new Auto[value1][value2];

				for (int i = 0; i < value1; i++) {
					for (int j = 0; j < value2; j++) {
						array1[i][j] = new Auto(150, 1995);
					}
				}
				System.out.println(Arrays.deepToString(array1));
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
