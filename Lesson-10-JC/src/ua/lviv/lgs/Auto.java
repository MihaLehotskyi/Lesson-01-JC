package ua.lviv.lgs;

public class Auto {
	private int NumberOfHorsepower;
	private int YearOfManufacture;
	
	public Auto(int numberOfHorsepower, int yearOfManufacture) {
		super();
		NumberOfHorsepower = numberOfHorsepower;
		YearOfManufacture = yearOfManufacture;
	}
	
	

	public int getNumberOfHorsepower() {
		return NumberOfHorsepower;
	}



	public int getYearOfManufacture() {
		return YearOfManufacture;
	}



	@Override
	public String toString() {
		return "Auto [NumberOfHorsepower = " + NumberOfHorsepower + ", YearOfManufacture = " + YearOfManufacture + "]";
	}
	
	
}
