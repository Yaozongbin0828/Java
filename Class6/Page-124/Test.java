package Example124;

public class Test {
	public static void main(String[] args) {

		CPU cpu = new CPU();
		cpu.speed = 2200;

		HardDisk disk = new HardDisk();
		disk.amount = 200;

		PC pc = new PC();
		pc.setCUP(cpu);
		pc.setHardDisk(disk);
		cpu.getSpeed();
		disk.getAmount();
		pc.show();
	}
}
