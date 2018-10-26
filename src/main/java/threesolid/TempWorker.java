package src;

public class TempWorker extends BaseWorker implements IEat, ISick {

    @Override
	public String work() {
    	String response = "Workin hard or hardly workin?";
	return response;
	}
	public String sick() {
    	String response = "Sick, taking the day off";
	return response;
	}
	public String eat() {
    	String response = "Lunchtime!";
	return response;
	}
}
