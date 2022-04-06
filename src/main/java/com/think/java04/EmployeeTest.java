package com.think.java04;

import java.time.LocalDate;

/**
 * @Classname EmployeeTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/6 16:00
 * @Created by deer-li
 */
public class EmployeeTest {
    public  static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("1", 10000, 1998, 11, 11);
        staff[1] = new Employee("2", 100000,1997, 12, 12);
        staff[2] = new Employee("3", 100000,1996, 11, 10);
        for (Employee e:staff){
            e.raiseSalary(5);
        }
        for (Employee e:staff){
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
        }
    }
}
class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;
    public Employee(String n,double s,int year,int month,int day){
        name=n;
        salary=s;
        hireDay=LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }
}
