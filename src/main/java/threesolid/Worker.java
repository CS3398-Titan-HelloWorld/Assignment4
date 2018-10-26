package src;


public class Worker extends BaseWorker implements IEat, ISick {
	 @Override
		public String work() {
		String response;
		response = "Workin hard or hardly workin?";
		return response;
	}

		public void sick() {
			System.out.println("Sick, taking the day off");

		}

		public void eat() {
			System.out.println("Lunchtime!");
		}
	}
