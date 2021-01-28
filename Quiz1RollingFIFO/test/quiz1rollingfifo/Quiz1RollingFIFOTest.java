package quiz1rollingfifo;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Quiz1RollingFIFOTest {

    public Quiz1RollingFIFOTest() {
    }

    @Test
    public void RollingPriorityFIFOSizeTest() throws FIFOFullException {
        RollingPriorityFIFO instance = new RollingPriorityFIFO(5);
      
        instance.enqueue("First", false);
        instance.enqueue("Second", true);
       
        assertEquals(2, instance.itemsCurrUsed);
    }
    
    @Test
    public void RollingPriorityFIFODequeueTest() throws FIFOFullException {
        RollingPriorityFIFO instance = new RollingPriorityFIFO(5);
      
        instance.enqueue("First", false);
        instance.enqueue("Second", true);
       
        assertEquals("Second", instance.dequeue());
    }
    
    
    @Test
    public void RollingPriorityFIFOToStringTest() throws FIFOFullException {
        RollingPriorityFIFO instance = new RollingPriorityFIFO(5);
      
        instance.enqueue("First", false);
        instance.enqueue("Second", true);
       
        assertEquals("[First,Second*]", instance.toString());
    }

}
