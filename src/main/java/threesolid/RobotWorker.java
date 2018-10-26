package src;

public class RobotWorker extends BaseWorker implements IReboot {
	@Override
	public String work() {
		String response;
		response = "Beep Borp?";
		return response;
	}
	public void reboot() {
		System.out.println("Rebooting");

	}

}
