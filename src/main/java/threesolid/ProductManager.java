package src;

public class ProductManager extends Manager {
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
	public void defineproduct() {
		System.out.println("Here, make this.");
	}
}
