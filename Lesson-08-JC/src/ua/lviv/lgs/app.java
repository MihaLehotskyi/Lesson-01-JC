/*
 * 
 * LOGOS IT ACADEMY lesson 8
 * 
 */

package ua.lviv.lgs;
/**
 * 
 * @since java 1.8
 * @author Міха
 * @version 2.0
 * 
 */

import java.util.Scanner;

public class app {
	/**
	 * 
	 * @author Міха
	 * @category program
	 * @see 10 functions
	 * 
	 *
	 */
	
	/* Enum seasons */
	enum Seasons {
		WINTER, SPRING, SUMMER, AUTUMN;
	}
	
	/* Enum months */
	enum Months {
		JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30),
		MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31),
		SEPTEMBER(Seasons.AUTUMN, 30), OCTOBER(Seasons.AUTUMN, 31), NOVEMBER(Seasons.AUTUMN, 30),
		DECEMBER(Seasons.WINTER, 31);
		
	/* Variables */
		
		Seasons seasons;
		int days;

	/* Constructors */
		
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

	/* Main menu */
	
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

	/* Main method */
	
	public static void main(String[] args) throws NoMonthException, InvalidNumOfDays {

		Months[] mas = Months.values();
		Seasons[] seas = Seasons.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {
			/* first case */
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
					String message = "Season does not exists";
					throw new NoMonthException(message);
				}
				break;
			}

			/* second case */
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
					String message = "Season does not exists";
					throw new NoMonthException(message);
				}

				break;
			}
			
			/* third case */
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
					String message = ("Season with " + days + " days does not exists");
					throw new InvalidNumOfDays(message);
				}
				break;
			}
			
			/* fourth case */
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
					String message = ("The number can not be less than 28");
					throw new InvalidNumOfDays(message);
				}
				break;
			}
			
			/* fifth case */
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
					String message = ("The number can not be more than 31");
					throw new InvalidNumOfDays(message);
				}
				break;
			}
			/* sixth case */
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
					String message = "Season does not exists";
					throw new NoMonthException(message);
				}

				break;
			}
			/* seventh case */
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
					String message = "Season does not exists";
					throw new NoMonthException(message);
				}

				break;
			}
			
			/* eighth case */
			case "8": {
				for (Months c : mas) {
					if ((c.getDays()) % 2 == 0) {
						System.out.println(c);
					}

				}
				break;
			}
			
			/* ninth case */
			case "9": {
				for (Months c : mas) {
					if ((c.getDays()) % 2 == 1) {
						System.out.println(c);
					}

				}
				break;
			}
			/* tenth case */
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
					String message = "Season does not exists";
					throw new NoMonthException(message);
				}
				break;
			}

			}
		}
	}
}