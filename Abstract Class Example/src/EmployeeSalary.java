/**
 * Created by Ovi on 2/8/2017.
 */
public class EmployeeSalary extends Employee {
    EmployeeSalary(String name, int number,double salary) {
        super(name, number,salary);
        setSalary(salary);
    }
    private double salary;
    public void AccountCheck() {
        System.out.println("Check account " + getName() + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}
