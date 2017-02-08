/**
 * Created by Ovi on 2/8/2017.
 */
public class MultiThread  {
    public static void main(String args[]){
        TextDemo t1=new TextDemo("Thread 1");
        TextDemo t2=new TextDemo("Thread 2");
        t1.start();
        t2.start();
    }
}
