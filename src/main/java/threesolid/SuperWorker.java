package src;


public class SuperWorker extends BaseWorker implements IEat, ISick {

    @Override
	public void work() {
    	System.out.println("Working hard. Just working hard.");
	}
	public void eat() {
		System.out.println("Food is for the weak");

	}
	public void sick() {
		System.out.println("I never get sick.");

	}

}
