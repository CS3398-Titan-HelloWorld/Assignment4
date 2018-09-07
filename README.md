# Assignment4
This is assignment 4 ( not the impostor)
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
