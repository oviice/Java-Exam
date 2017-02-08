import java.util.Scanner;

/**
 * Created by Ovi on 2/8/2017.
 */
public class JavaException {
    public static void main(String args[]){
        int i=0,a,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please input the value which is divide by 0: ");
        a=sc.nextInt();
        try {
            n=a/i;
            System.out.print("Divide value is: "+n);
        }
        catch (Exception e){
            System.out.println("This Exception is:" +e);
        }
    }
}
