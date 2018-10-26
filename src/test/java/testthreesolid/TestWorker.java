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

 @Test
 @DisplayName("newtestPCWorkerPass")
 public void testEatMethod()
 {
	 assertEquals(w.eat(), "Lunchtime!", "The method text and the expected text are not the same");
 }
 
}