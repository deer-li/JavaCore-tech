package com.think.java06.interfaces;

/**
 * @Classname Employee
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/12 14:25
 * @Created by deer-li
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise =salary*byPercent/100;
        salary+=raise;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }
}
