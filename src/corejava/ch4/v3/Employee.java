package corejava.ch4.v3;

public class Employee {
    private static int nextId;

    private String name;
    private double salary;
    private int id;


    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public void raiseSalary(double byPrecent) {
        double raise = salary * byPrecent / 100;
        salary += raise;
    }

}
