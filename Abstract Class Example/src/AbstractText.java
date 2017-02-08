/**
 * Created by Ovi on 2/8/2017.
 */
public class AbstractText {
    public static void main(String args[]) {
        EmployeeSalary s = new EmployeeSalary("Asfaque", 3,2600);
        Employee e = new EmployeeSalary("Ovi", 2,2000);
        System.out.println("Asfaque Info..........");
        s.AccountCheck();
        System.out.println("\n Ovi Info...........");
        e.check();
    }
}

