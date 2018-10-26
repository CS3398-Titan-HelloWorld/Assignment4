package src;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {
	private Worker w = new Worker();
 	@Test
 	@DisplayName("Work Method Test")
 	public void testWorkMethod()
 	{
 		assertEquals(w.work(),"I'm working already!","Mismatch between test text and method text");
 	}
	
	//This is the Section Ian implented
	private TempWorker tW = new TempWorker();
	@Test
	@DisplayName("Testing Work Method in TempWorker")
	public void testTempWork()
	{
		assertEquals(tW.work(),"Workin hard or hardly workin?", "Mismatch between test text and method text");
		//This test should return true, as this is what TempWorker shoud say while working
	}
	@Test
	@DisplayName("Testing Sick Method in TempWorker")
	public void testTempSick()
	{
		assertEquals(tW.sick(),"I'm totally in the office, boss", "Mismatch between test text and method text");
		//This should return false, because Temp Worker is a filthy liar
	}
}

