package src;

public class TempWorker extends BaseWorker implements IEat, ISick {

    @Override
	public string work() {
    		String w = "Workin hard or hardly workin?"; 
		System.out.println(w);
		return w;
	}

	public string sick() {
		String s = "Sick, taking the day off"
		System.out.println(s);
		return s;

	}

	public void eat() {
		System.out.println("Lunchtime!");
	}
}
