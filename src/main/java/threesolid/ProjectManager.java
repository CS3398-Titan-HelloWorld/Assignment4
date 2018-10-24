package src;

public class ProjectManager extends Manager {
	BaseWorker worker;
	public void Manager() {

	}
	@Override
	public void setWorker(BaseWorker w) {
		worker=w;
	}
    @Override
	public void manage() {
		worker.work();
	}
	public void schedulework() {
		System.out.println("Work these hours");
	}
}

