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
  
 //Ian's Section
 private TempWorker tW = new TempWorker();
 @Test
 @DisplayName("TempWorkerTest")
 public void tempWorktestICPass()
  {
    assertEquals(tW.work(),"Workin hard or hardly workin?","Mismatch between test text and method text");
    //This should return true as this is the String that is returned by work()
  }
  public void tempSicktestICFail()
  {
    assertEquals(tW.sick(),"Im totally in the office, boss","Mismatch between test text and method text");
    //This should return false as this TempWorker is a dirty liar
  }
 
}
