package ua.lviv.lgs;

public class InvalidNumOfDays extends Exception{
	
	private String amount;

	public InvalidNumOfDays(String amount) {
		super(amount);
		this.amount = amount;
	}

}
