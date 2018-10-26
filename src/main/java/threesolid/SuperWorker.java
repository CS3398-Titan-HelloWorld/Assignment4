package src;


public class SuperWorker extends BaseWorker implements IEat, ISick {

    @Override
	public String work() {
		String response = "Workin hard. Just working hard.";
		return response;
	}	
	public String work() {
		String response = "Food is for the weak";
		return response;
	}	
	public String work() {
		String response = "I never get sick.";
		return response;
	}

}
