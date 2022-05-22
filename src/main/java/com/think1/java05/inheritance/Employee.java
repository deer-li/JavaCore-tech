package com.think1.java05.inheritance;
import java.time.LocalDate;

/**
 * @Classname Employee
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/8 10:39
 * @Created by deer-li
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;

    public Employee(String name,double salary,int year,int month,int day){
        this.name=name;
        this.salary=salary;
        hireday = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }
    public void raiseSalary(double byPercent){
        double raise =salary*byPercent/100;
        salary+=raise;
    }
}
