package com.lgs.lab.interface1;

public interface Numerable extends Devide, Multiply, Minus, Plus{

	@Override
	default void Plus(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	default void Minus(int a, int b) {
		System.out.println(a-b);
		
	}

	@Override
	default void Multiply(int a, int b) {
		System.out.println(a*b);
		
	}

	@Override
	default void Devide(int a, int b) {
		System.out.println(a/b);
		
	}

	
	
	

	
	
}
