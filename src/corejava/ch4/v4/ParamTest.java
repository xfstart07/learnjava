package corejava.ch4.v4;

// 方法参数传递
public class ParamTest {
    public static void main(String[] main) {
        System.out.println("Testing tripleValue:");
        double precent = 10;

        System.out.println("Before: precent: " + precent);
        tripleValue(precent);
        System.out.println("After: precent: " + precent);

        System.out.println("\nTesting tripleSalary:");
        Employee harry = new Employee("Harry", 5000);

        System.out.println("Before: salary: " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary: " + harry.getSalary());

        Employee a = new Employee("Alice", 7000);
        Employee b = new Employee("Leon", 6000);

        System.out.println("Before: a: " + a.getName());
        System.out.println("Before: b: " + b.getName());
        swap(a, b);
        System.out.println("After: a: " + a.getName());
        System.out.println("After: b: " + b.getName());
    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x="+x);
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary="+x.getSalary());
    }

//    NOTE: 只是两个引用地址直接的交换，对原对象没有产生影响。
    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;

        System.out.println("End of method: x="+x.getName());
        System.out.println("End of method: y="+y.getName());
    }
}
