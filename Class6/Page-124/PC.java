package Example124;

import java.util.HashMap;

public class PC {
	CPU cpu;
	HardDisk HD;

	void setCUP(CPU c) {
		this.cpu = c;
	}

	void setHardDisk(HardDisk h) {
		this.HD = h;
	}

	void show() {

		System.out.println("CPU的速度：" + cpu.getSpeed() + "硬盘的容量" + HD.getAmount());

	}
}
