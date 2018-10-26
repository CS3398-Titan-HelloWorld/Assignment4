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
  // The following test should pass becuase the string that the method returns is the same as the string being tested
 public void newtest<NB>WorkerPass()
 {
 assertEquals(w.eat(),"Lunch time!","Mismatch between test text and method text");
 }
  // The following test should fail becuase the string that the method returns is different than the string being tested
 public void newtest<NB>WorkerFail()
 {
 assertEquals(w.sick(),"I'm sick already!","Mismatch between test text and method text");
 }
 
}
