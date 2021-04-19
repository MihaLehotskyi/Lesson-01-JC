package ua.lviv.lgs;

public class NoMonthException extends Exception{
	
	private String amount;

	public NoMonthException(String amount) {
		super(amount);
		this.amount = amount;
	}
	
}
