package ua.lviv.lgs;

public class HourWorker implements Sallary{
	
	private int HourWorkerSallary;
	
	public HourWorker(int hourWorkerSallary) {
		HourWorkerSallary = hourWorkerSallary;
	}

	@Override
	public void sallary() {
		System.out.println("HourWorkerSallary= "+HourWorkerSallary*160+" $");
		
	}

}
