package ua.lviv.lgs;

import java.util.Scanner;

public class MyThread extends Thread{
	 public synchronized void run() {
		    System.out.print("Enter number of elements you want to see : ");
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int n0 = 1;
			int n1 = 1;
			int n2;
			System.out.print("Thread : ");
			System.out.print(1+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(1+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int i = 3; i <= num; i++){
				n2=n0+n1;
				System.out.print(n2+" ");
				n0=n1;
				n1=n2;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
	   }
	 
}
