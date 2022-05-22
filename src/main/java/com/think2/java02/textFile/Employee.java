package com.think2.java02.textFile;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @Classname Employee
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/10 9:05
 * @Created by deer-li
 */
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
        return hireDay;
    }

    public Employee(String name, double salary, int year, int month, int day){
        this.name=name;
        this.salary=salary;
        hireDay=LocalDate.of(year,month,day);

    }
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return  false;
        }
        if (obj==null){
            return false;
        }
        if (getClass()!=obj.getClass()){
            return  false;
        }
        Object other = (Employee)obj;

        return Objects.equals(name,((Employee) other).name) &&salary==((Employee) other).salary&&Objects.equals(hireDay,((Employee) other).hireDay);
    }
    public int hashcode(){
        return Objects.hash(name,salary,hireDay);
    }
    public String toString(){
        return getClass().getName()+"[name="+name+",salary="+salary+",hireDay="+hireDay+"]";
    }
}
