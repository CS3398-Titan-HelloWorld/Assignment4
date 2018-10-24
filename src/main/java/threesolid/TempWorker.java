package src;

public class TempWorker extends BaseWorker implements IEat, ISick {

    @Override
	public void work() {
    	System.out.println("Workin hard or hardly workin?");
	}

	public void sick() {
		System.out.println("Sick, taking the day off");

	}

	public void eat() {
		System.out.println("Lunchtime!");
	}
}
