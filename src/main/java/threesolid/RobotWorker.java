package src;

public class RobotWorker extends BaseWorker implements IReboot {
	@Override
	public String work() {
		String response;
		response = "Beep Borp?";
		return response;
	}
	public String reboot() {
		String talking;
		talking = "Rebooting";
		return talking
	}

}
