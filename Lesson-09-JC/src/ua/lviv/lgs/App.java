package ua.lviv.lgs;

import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
		
		// 1 Task
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next().toLowerCase();
		
		if((name.length())!=5) {
			System.out.println("Enter 5 symbols!");
		}else {
			if((name.charAt(0) == name.charAt(4)) & (name.charAt(1) == name.charAt(3))){
				System.out.println("Succes!!!");
			}else {
				System.out.println("NO");
			}
		}
		
		// 2 Task
		
		StringBuffer name1 = new StringBuffer("Banana");
		name1.replace(1, 2, "-");
		name1.replace(3, 4, "-");
		name1.replace(5, 6, "-");
		System.out.println(name1);
	
}
}