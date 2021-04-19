package ua.lviv.lgs;

public class MyException extends Exception{
	
	private String amount;

	public MyException(String amount) {
		super(amount);
		this.amount = amount;
	}
}
