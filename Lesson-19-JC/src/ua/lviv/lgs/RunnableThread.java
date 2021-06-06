package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RunnableThread implements Runnable{

	@Override
	public synchronized void run() {
		System.out.print("Enter number of elements you want to see : ");
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n0 = 1;
		int n1 = 1;
		int n2;
		list.add(1);
		list.add(1);
		for(int i = 3; i <= num; i++){
			n2=n0+n1;
			list.add(n2);
			n0=n1;
			n1=n2;
		}
		Collections.sort(list, Collections.reverseOrder());
		System.out.print("Runnable : ");
		for(int i = 0; i <= num - 3; i++){
			System.out.print(list.get(i)+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		System.out.print(1+" ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
