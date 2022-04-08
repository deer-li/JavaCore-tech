package com.think.java05.abstractClasses;

import java.time.LocalDate;

/**
 * @Classname Employee
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/8 19:12
 * @Created by deer-li
 */
public class Employee extends Person{
    private double salary;
    private LocalDate hireday;

    public Employee(String name, double salary,int year,int month,int day) {
        super(name);
        this.salary = salary;
        hireday =LocalDate.of(year,month,day) ;
    }


    public double getSalary() {
        return salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }
    public String getDescription(){
        return String.format("an employee with a salary of $%.2f",salary);
    }
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }
}
