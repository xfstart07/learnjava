package corejava.ch4.v2;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
//      如果需要返回一个可变对象的引用，应该首先对它进行克隆（clone）
//        return hireDay.clone();
        return hireDay; // bad, 外部能修改 hireDay 的值
    }

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }
}