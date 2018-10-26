package src;

public class TempWorker extends BaseWorker implements IEat, ISick {


	public String work() {
		String response;
		response = "Workin hard or hardly workin?";
		return response;
	}

	public String sick() {
		String response;
		response = "Sick, taking the day off";
		return response;
	}
	
	public String eat() {
		String response;
		response = "Break Time!";
		return response;
	}
}
