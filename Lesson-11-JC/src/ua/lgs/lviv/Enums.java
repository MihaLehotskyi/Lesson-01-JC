package ua.lgs.lviv;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Enums {
	enum Seasons {
		WINTER, SPRING, SUMMER, AUTUMN;
	}

	enum Months {
		JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30),
		MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31),
		SEPTEMBER(Seasons.AUTUMN, 30), OCTOBER(Seasons.AUTUMN, 31), NOVEMBER(Seasons.AUTUMN, 30),
		DECEMBER(Seasons.WINTER, 31);

		Seasons seasons;
		int days;

		Months(Seasons seasons, int days) {
			this.seasons = seasons;
			this.days = days;
		}
		
		
		public Seasons getSeasons() {
			return seasons;
		}

		public int getDays() {
			return days;
		}
	}

	static void menu() {
		System.out.println("Press 1 to check if the month exists");
		System.out.println("Press 2 to check all months with the same season");
		System.out.println("Press 3 to check all months with the same number of days");
		System.out.println("Press 4 to check all months with less days");
		System.out.println("Press 5 to check all months with more days");
		System.out.println("Press 6 to check the next season");
		System.out.println("Press 7 to check previous season");
		System.out.println("Press 8 to check all months with even number of days");
		System.out.println("Press 9 to check all months with odd number of days");
		System.out.println("Press 10 to check if the month has even number of days");
	}

	public static void main(String[] args) {
		
		Months[] mas = Months.values();
		List mas1 = new ArrayList();
		mas1.add(Months.JANUARY.name());
		mas1.add(Months.FEBRUARY.name());
		mas1.add(Months.MARCH.name());
		mas1.add(Months.APRIL.name());
		mas1.add(Months.MAY.name());
		mas1.add(Months.JUNE.name());
		mas1.add(Months.JULY.name());
		mas1.add(Months.AUGUST.name());
		mas1.add(Months.SEPTEMBER.name());
		mas1.add(Months.OCTOBER.name());
		mas1.add(Months.NOVEMBER.name());
		mas1.add(Months.DECEMBER.name());
		System.out.println(mas1);
		
		List mas2 = new ArrayList();
		mas2.add(Months.JANUARY.getSeasons());
		mas2.add(Months.FEBRUARY.getSeasons());
		mas2.add(Months.MARCH.getSeasons());
		mas2.add(Months.APRIL.getSeasons());
		mas2.add(Months.MAY.getSeasons());
		mas2.add(Months.JUNE.getSeasons());
		mas2.add(Months.JULY.getSeasons());
		mas2.add(Months.AUGUST.getSeasons());
		mas2.add(Months.SEPTEMBER.getSeasons());
		mas2.add(Months.OCTOBER.getSeasons());
		mas2.add(Months.NOVEMBER.getSeasons());
		mas2.add(Months.DECEMBER.getSeasons());
		System.out.println(mas2);
		
		List <Integer> mas3 = new ArrayList();
		mas3.add(Months.JANUARY.getDays());
		mas3.add(Months.FEBRUARY.getDays());
		mas3.add(Months.MARCH.getDays());
		mas3.add(Months.APRIL.getDays());
		mas3.add(Months.MAY.getDays());
		mas3.add(Months.JUNE.getDays());
		mas3.add(Months.JULY.getDays());
		mas3.add(Months.AUGUST.getDays());
		mas3.add(Months.SEPTEMBER.getDays());
		mas3.add(Months.OCTOBER.getDays());
		mas3.add(Months.NOVEMBER.getDays());
		mas3.add(Months.DECEMBER.getDays());
		System.out.println(mas3);
		

		Seasons[] seas = Seasons.values();
		List seas1 = new ArrayList();
		seas1.add(Seasons.WINTER.name());
		seas1.add(Seasons.SPRING.name());
		seas1.add(Seasons.SUMMER.name());
		seas1.add(Seasons.AUTUMN.name());
		System.out.println(seas1);
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();
				boolean flag = false;
				for (int i = 0; i < 12; i++) {
					if (mas1.get(i).equals(months)) {
						System.out.println("Month exists");
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month does not exists");
				}
				break;
			}

			case "2": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();

				boolean flag = false;

				for (int i = 0; i < 12; i++) {
					if (mas2.get(i).toString().equalsIgnoreCase(seasons)) {
						flag = true;

					}
				}

				if (flag) {
					Seasons s = Seasons.valueOf(seasons);

					for (int i = 0; i < 12; i++) {
						if (mas2.get(i).toString().equalsIgnoreCase(seasons)) {
							System.out.println(mas1.get(i));

						}
					}
				}
				if (!flag) {
					System.out.println("Season does not exists");
				}

				break;
			}

			case "3": {
				System.out.println("Enter number of days");
				sc = new Scanner(System.in);
				int days = sc.nextInt();
				boolean flag = false;
				for (int i = 0; i < 12; i++) {
					if (mas3.get(i) == days) {
						for (int i1 = 0; i < 12; i++) {
							if (mas3.get(i) == days) {
								System.out.println(mas1.get(i));
								flag = true;
							}

						}
					}
				}
				if (!flag) {
					System.out.println("Season with " + days + " days does not exists");
				}
				break;
			}
			case "4": {
				System.out.println("Enter number of days");
				sc = new Scanner(System.in);
				int days = sc.nextInt();
				boolean flag = false;
				for (int i = 0; i < 12; i++) {
					if (mas3.get(i) < days) {
						for (int i1 = 0; i < 12; i++) {
							if (mas3.get(i) < days) {
								System.out.println(mas1.get(i));
								flag = true;
							}
						}

					}
				}
				if (!flag) {
					System.out.println("The number can not be less than 28");
				}
				break;
			}
			case "5": {
				System.out.println("Enter number of days");
				sc = new Scanner(System.in);
				int days = sc.nextInt();
				boolean flag = false;
				for (int i = 0; i < 12; i++) {
					if (mas3.get(i) > days) {
						for (int i1 = 0; i < 12; i++) {
							if (mas3.get(i) > days) {
								System.out.println(mas1.get(i));
								flag = true;
							}
						}

					}
				}
				if (!flag) {
					System.out.println("The number can not be more than 31");
				}
				break;
			}
			case "6": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();

				boolean flag = false;

				for (int i = 0; i < 4; i++) {
					if (seas1.get(i).toString().equalsIgnoreCase(seasons)) {
						flag = true;

					}
				}
				if (flag) {
					for (int i1 = 0; i1 < 4; i1++) {
						if (seas1.get(i1).toString().equalsIgnoreCase(seasons) && i1 == 3) {
							System.out.println(seas1.get(0));
							break;
						} else {
						if (seas1.get(i1).toString().equalsIgnoreCase(seasons) && i1 < 3) {
							System.out.println(seas1.get(i1+1));
							break;
						}
					}
				}
				}
				if (!flag) {
					System.out.println("Season does not exists");
				}

				break;
			}
			case "7": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();

				boolean flag = false;

				for (int i = 0; i < 4; i++) {
					if (seas1.get(i).toString().equalsIgnoreCase(seasons)) {
						flag = true;

					}
				}
				if (flag) {
					for (int i1 = 0; i1 < 4; i1++) {
						if (seas1.get(i1).toString().equalsIgnoreCase(seasons) && i1 == 0) {
							System.out.println(seas1.get(3));
							break;
						} else {
						if (seas1.get(i1).toString().equalsIgnoreCase(seasons) && i1 > 0) {
							System.out.println(seas1.get(i1-1));
							break;
						}
					}
				}
				}
				if (!flag) {
					System.out.println("Season does not exists");
				}

				break;
			}
			case "8": {
				for (int i = 0; i < 12; i++) {
					if (mas3.get(i) % 2 == 0) {
						System.out.println(mas1.get(i));
					}

				}
				break;
			}
			case "9": {
				for (int i = 0; i < 12; i++) {
					if (mas3.get(i) % 2 == 1) {
						System.out.println(mas1.get(i));
					}

				}
				break;
			}
			case "10": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();
				boolean flag = false;
				for (int i = 0; i < 12; i++) {
					if (mas1.get(i).toString().equalsIgnoreCase(months)) { 
						flag = true;
					}
				}
				if (flag) {
					for (int i = 0; i < 12; i++) {
						if (mas1.get(i).toString().equalsIgnoreCase(months) && mas3.get(i) % 2 == 0) { 
							System.out.println(mas1.get(i) + " has even number of days");
						}else {
						if(mas1.get(i).toString().equalsIgnoreCase(months) && mas3.get(i) % 2 == 1){
							System.out.println(mas1.get(i) + " has odd number of days");
						}				
						}
				}
				}
				if (!flag) {
						System.out.println("Season does not exists");
				}
				break;
			}

			}
		}
	}
}
