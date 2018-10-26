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
 	public void testEatMethod()
 	{
 		assertEquals(w.eat(),"I'm eating already!","Mismatch between test text and method text");
 	}
 	public void testSickMethod()
 	{
 		assertEquals(w.sick(),"I'm sick already!","Mismatch between test text and method text");
 	}

 	private RobotWorker rw = new RobotWorker();
 	public void newtestBKRobotWorkerPass()
 	{
 		//Tests the work function in RobotWorker.java and should pass
 		assertEquals(rw.work(),"Beep Borp?", "Mismatch between test text and method text");
 	}
 	public void newtestBKRobotWorkerFail()
 	{
 		//Tests the reboot function in RobotWorker.java and should fail
 		assertEquals(rw.reboot(), "Take over the world", "Mismatch between test text and method text");
 	}
}