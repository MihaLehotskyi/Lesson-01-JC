package ua.lviv.lgs;

public class Methods {
	private int a;
	private int b;
	private int plus;
	private int minus;
	private int multiplication;
	private int division;
	
	public Methods(int a, int b) {
		this.a = a;
		this.b = b;
		this.plus = a + b;
		this.minus = a - b;
		this.multiplication = a * b;
		this.division = a / b;
	}
	
	
	
	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}



	@Override
	public String toString() {
		return "Methods [plus = " + plus + ", minus = " + minus + ", multiplication = " + multiplication + ", division = "
				+ division + "]";
	}
	public static void main(String[] args) throws IllegalAccessException, MyException {
		
		Methods m = new Methods(2,3);
		
		
		
		
		if( m.getA() < 0 & m.getB() < 0) {
			throw new IllegalArgumentException();
		} if (( m.getA() == 0 & m.getB() != 0)|(m.getA() != 0 & m.getB() == 0)) {
			throw new ArithmeticException();
		} if (m.getA() == 0 & m.getB() == 0) {
			throw new IllegalAccessException();
		} if(m.getA() > 0 & m.getB() > 0) {
			String message = "Calculation error!!!";
			throw new MyException(message);
		}else System.out.println(m);
		
}
}
