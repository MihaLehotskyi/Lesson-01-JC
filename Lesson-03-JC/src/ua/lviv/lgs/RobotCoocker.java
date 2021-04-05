package ua.lviv.lgs;

public class RobotCoocker extends Robot {

	public RobotCoocker(String work) {
		super(work);
	}

	@Override
	public String toString() {
		return "RobotCoocker [work=" + super.getWork() + "]";
	}
}
