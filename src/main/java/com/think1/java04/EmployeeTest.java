package com.think1.java04;

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
        //调用构造器方法实例化staff对象，不能对已经实例化过的的对象调用构造器来达到重新设置实例字段的目的
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
    //构造器没有返回值
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
    //这里涉及到显式参数和隐式参数的问题，显式参数不用说了，自然是方法里看的见的参数
    //隐式参数就salary，实际上应该表达为this.salary.代表类实例对象；
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }
}
