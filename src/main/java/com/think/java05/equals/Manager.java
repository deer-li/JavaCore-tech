package com.think.java05.equals;

/**
 * @Classname Manager
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/10 9:13
 * @Created by deer-li
 */
public class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus=0;
    }

    @Override
    public double getSalary() {
        double baseSalary=super.getSalary();
        return baseSalary+=bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return  false;
        }
        Object obj1 = (Manager)obj;
        return bonus==((Manager) obj1).bonus;
    }

    @Override
    public int hashcode() {
        return java.util.Objects.hash(super.hashcode(),bonus);
    }

    @Override
    public String toString() {
        return super.toString()+"[bonus="+bonus+"]";
    }
}
