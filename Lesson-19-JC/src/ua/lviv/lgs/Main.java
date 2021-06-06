package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		//MyThread mythread = new MyThread();
		//mythread.start();
		RunnableThread myrunnable = new RunnableThread();
		Thread t = new Thread(myrunnable);
		t.start();
	}

}
