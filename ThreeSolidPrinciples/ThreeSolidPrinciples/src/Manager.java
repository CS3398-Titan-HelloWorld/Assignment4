package threesolid;

class Manager 
{
	RootWorker worker;

	public void Manager() 
	{

	}
	
	public void setWorker(RootWorker w) 
	{
		worker = w;
	}

	public void manage() 
	{
		worker.work();
	}
}
