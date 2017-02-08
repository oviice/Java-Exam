/**
 * Created by Ovi on 2/8/2017.
 */
public class TextDemo extends Thread {
    String threadName;
    Thread t;
    TextDemo(String threadName){
        this.threadName=threadName;
    }
    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 0; i <=10; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " stopped");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
