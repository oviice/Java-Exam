/**
 * Created by Ovi on 2/8/2017.
 */
public abstract class Employee {
    private String name;
    private int number;
    Employee(String name, int number, double salary) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + " " + number;
    }

    public String getName() {
        return name;
    }
    public void check() {
        System.out.println("Account check " + this.name +" Ranking number "+this.number);
    }

    public int getNumber() {
        return number;
    }
}
