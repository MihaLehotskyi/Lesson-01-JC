package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
		MonthWorker mw = new MonthWorker(1000);
		mw.sallary();
		HourWorker hw = new HourWorker(8);
		hw.sallary();
	}
}
