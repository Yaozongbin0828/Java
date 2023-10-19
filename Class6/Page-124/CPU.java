package Example124;

public class CPU {
	double speed;

	public void setSpeed(int s) {
		speed = s;
	}

	public double getSpeed() {
		System.out.println("CPU速度是" + speed);
		return speed;
	}
}
