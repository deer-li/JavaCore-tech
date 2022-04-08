package com.think.java05;

/**
 * @Classname Manager
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/8 10:39
 * @Created by deer-li
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus=0;
    }

    @Override
    public double getSalary() {
        double baseSalary=super.getSalary();
        return baseSalary+bonus;
    }
    public double setBonus(double b){
        return bonus=b;
    }
}
