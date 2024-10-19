
import java.lang.Thread;

class YeildProg implements Runnable{

    public void run()
    {
        System.out.println("Started " + Thread.currentThread());
       
        Thread.yield();
        System.out.println("Ended " + Thread.currentThread());
    }
   
}
public class YieldProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YeildProg y1 = new YeildProg();
	       
        Thread t1 = new Thread(y1, "First child thread");
       
        YeildProg y2 = new YeildProg();
       
        Thread t2 = new Thread(y1, "Second child thread");
       
       
//        t1.start();
//        
//        t1.join();
//        
//        t2.start();
//        t2.join();
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    
}


}
