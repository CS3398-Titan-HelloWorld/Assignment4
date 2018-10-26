package src;


public class SuperWorker extends BaseWorker implements IEat, ISick {

    @Override
	public String work() {
		String response;
		response = "Workin hard. Just working hard.";
		return response;
	}
	public void eat() {
		System.out.println("Food is for the weak");

	}
	public void sick() {
		System.out.println("I never get sick.");

	}

}
