package quiz1rollingfifo;

public class Quiz1RollingFIFO {

    public static void main(String[] args) {
         RollingPriorityFIFO fifo = new RollingPriorityFIFO(5);
        try
        {
        fifo.enqueue("First", false);
        fifo.enqueue("Second", true); }
        catch(FIFOFullException ex)
       {
           System.out.println(ex.getMessage());
       }
        System.out.println(fifo.toString());
    }
    
}
