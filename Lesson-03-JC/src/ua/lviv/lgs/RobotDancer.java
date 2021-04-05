package ua.lviv.lgs;

public class RobotDancer extends Robot {

	public RobotDancer(String work) {
		super(work);
	}
	
	@Override
	public String toString() {
		return "RobotDancer [work=" + super.getWork() + "]";
	}
}
