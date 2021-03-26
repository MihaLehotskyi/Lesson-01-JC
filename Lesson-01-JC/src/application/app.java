package application;

public class app {
	public static void main(String[] args) {
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4;
		char e = 5;
		float f = 6;
		double g = 7;
		boolean h = true;
		
		System.out.println("Найбільше значення : " + g);
		System.out.println("Найменше значення : " + a);
		
int [] array = new int [10];
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		for (int i= 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		int minValue = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		System.out.println("Мінімальний елемент масиву: " + minValue);
		
		int maxValue = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		System.out.println("Максимальний елемент масиву: " + maxValue);
	}
}
