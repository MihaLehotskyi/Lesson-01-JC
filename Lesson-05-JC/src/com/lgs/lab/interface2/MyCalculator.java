package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{
	public static void main(String[] args) {
		MyCalculator n = new MyCalculator();
		n.Minus(5,5);
		n.Plus(6, 70);
		n.Multiply(5, 6);
		n.Devide(16, 8);
	}

}
