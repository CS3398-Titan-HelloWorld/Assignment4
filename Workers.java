package src;


public class Worker extends RootWorker implements Iworkable, Ifeedable {
	public void work() {
		// .... Working
	}
	public void eat() {
		// ..... eating in launch break
	}
}
public class SuperWorker extends RootWorker implements Iworkable, Ifeedable {

	public void work() {
		// .... working much more
	}
	public void eat() {
		// ... eating in launch break

	}
}
public class RobotWorker extends RootWorker implements Iworkable, Ichargeable {
	public void work() {
		// ...working beep borp
	}
	public void charge() {
		// ...charging
	}
}


/*
These are the three classes we have created for the different types of workers.
They each extend the RootWorker class seeing as all three worker types all need
the ability to "work". The Worker and SuperWorker implement the IFeedable interface
while the RobotWorker implements the Ichargeable interface seeing as it does not
consume food. 
*/