package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		//1 частина
		MyThread mythread = new MyThread();
		mythread.start();
		//2 частина
		RunnableThread myrunnable = new RunnableThread();
		Thread t = new Thread(myrunnable);
		t.start();
	}

}
