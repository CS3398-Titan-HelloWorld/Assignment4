package src;


public class Worker extends BaseWorker implements IEat, ISick {
	 @Override
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
		response = "Lunch time!";
		return response;
	}
	}
