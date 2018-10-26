package <src>;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {
 private Worker w = new Worker();
 private SuperWorker SW = new SuperWorker();
 @Test
 @DisplayName("Work Method Test")
 public void testWorkMethod()
 {
 assertEquals(w.work(),"I'm working already!",”Mismatch between test text and method text”);
 }
  public void testEatMethod()
 {
 assertEquals(w.eat(),"I'm eating already!","Mismatch between test text and method text");
 }
 public void testSickMethod()
 {
 assertEquals(w.sick(),"I'm sick already!","Mismatch between test text and method text");
 }
 
 public void testWorkMethod(){
 	assertEquals(SW.work(), "Working hard. Just working hard.", "Mismatch between test text and method text");
 }
 public void testWorkMethod(){
 	assertEquals(SW.eat(), "Is there more coffee?", "Mismatch between test text and method text");
 }
}
