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

    //compareTo方法和equals方法在类继承的时候，比较时有一样的问题，
    //即当子类方法要重写上述两个方法时候，就必须做好准备去比较子类和父类，并不是仅仅将父类强制转换成子类
    //检测方式：if(getClass()!=参数.getClass()) throw new ClassCastException();
    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }
}
