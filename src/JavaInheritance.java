import java.util.Scanner;

/**
 * Created by Ovi on 2/8/2017.
 */
public class JavaInheritance extends Calculator {
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please input the number of a : ");
        a=sc.nextInt();
        System.out.print("Please input the number of b : ");
        b=sc.nextInt();
        JavaInheritance inheritance=new JavaInheritance();
        inheritance.add(a,b);
        inheritance.subtract(a,b);
        inheritance.multiply(a,b);
        inheritance.divide(a,b);
    }
}
