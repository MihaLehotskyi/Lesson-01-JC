package ua.lviv.lgs;

public class Robot {

	private String work;

	Robot(String work) {
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Robot [work=" + work + "]";
	}
	
	
	
}
