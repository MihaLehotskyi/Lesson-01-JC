package ua.lviv.lgs;

public class MonthWorker implements Sallary {
	
	private int MonthWorkerSallary;
	
	public MonthWorker(int monthWorkerSallary) {
		MonthWorkerSallary = monthWorkerSallary;
	}



	@Override
	public void sallary() {
		System.out.println("MonthWorkerSallary = "+MonthWorkerSallary+" $");
		
	}

	
}
