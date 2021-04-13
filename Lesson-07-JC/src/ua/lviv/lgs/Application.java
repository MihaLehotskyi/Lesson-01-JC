package ua.lviv.lgs;

import java.util.Scanner;

public class Application {
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
		Seasons[] seas = Seasons.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();
				boolean flag = false;
				for (Months c : mas) {
					if (c.name().equals(months)) {
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

				for (Months m : mas) {
					if (m.getSeasons().name().equals(seasons)) {
						flag = true;

					}
				}

				if (flag) {
					Seasons s = Seasons.valueOf(seasons);

					for (Months ma : mas) {
						if (ma.getSeasons().toString().equalsIgnoreCase(seasons)) {
							System.out.println(ma);

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
				for (Months c : mas) {
					if (c.getDays() == days) {
						for (Months m : mas) {
							if (m.getDays() == days) {
								System.out.println(m);
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
				for (Months c : mas) {
					if (c.getDays() < days) {
						for (Months m : mas) {
							if (m.getDays() < days) {
								System.out.println(m);
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
				for (Months c : mas) {
					if (c.getDays() > days) {
						for (Months m : mas) {
							if (m.getDays() > days) {
								System.out.println(m);
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

				for (Months m : mas) {
					if (m.getSeasons().name().equals(seasons)) {
						flag = true;

					}
				}

				if (flag) {
					Seasons s2 = Seasons.valueOf(seasons);
					int ordinal = s2.ordinal();

					if (ordinal == (seas.length - 1)) {
						ordinal = 0;
						System.out.println(seas[ordinal]);
					} else {
						System.out.println(seas[ordinal + 1]);
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

				for (Months m : mas) {
					if (m.getSeasons().name().equals(seasons)) {
						flag = true;

					}
				}

				if (flag) {
					Seasons s2 = Seasons.valueOf(seasons);
					int ordinal = s2.ordinal();

					if (ordinal == (0)) {
						ordinal = (seas.length - 1);
						System.out.println(seas[ordinal]);
					} else {
						System.out.println(seas[ordinal - 1]);
					}
				}
				if (!flag) {
					System.out.println("Season does not exists");
				}

				break;
			}
			case "8": {
				for (Months c : mas) {
					if ((c.getDays()) % 2 == 0) {
						System.out.println(c);
					}

				}
				break;
			}
			case "9": {
				for (Months c : mas) {
					if ((c.getDays()) % 2 == 1) {
						System.out.println(c);
					}

				}
				break;
			}
			case "10": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();
				boolean flag = false;
				for (Months c : mas) {
					if (c.name().equals(months)) { 
						flag = true;
					}
				}
				if (flag) {
						Months m1 = Months.valueOf(months);
						int ordinal = m1.ordinal();
						if ((m1.getDays()) % 2 == 0) {
							System.out.println(m1 + " has even number of days");
						} else {
							System.out.println(m1 + " has odd number of days");
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
