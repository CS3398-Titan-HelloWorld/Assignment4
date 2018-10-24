package src;

public class RobotWorker extends BaseWorker implements IReboot {
	@Override
	public void work() {
		System.out.println("Beep borp");
	}
	public void reboot() {
		System.out.println("Rebooting");

	}

}
