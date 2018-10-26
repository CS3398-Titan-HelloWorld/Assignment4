package src;


public class SuperWorker extends BaseWorker implements IEat, ISick {

    @Override
	public String work() {
		String response;
		response = "Workin hard. Just working hard.";
		return response;
	}
	public String eat() {
		String response;
		response = "Food is for the weak";
		return response;
	}
	public String sick() {
		String response;
		response = "I never get sick";
		return response;
	}

}
