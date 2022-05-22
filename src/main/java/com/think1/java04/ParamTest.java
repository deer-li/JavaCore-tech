package com.think1.java04;

/**
 * @Classname ParamTest
 * @Description 该类着重强调Java参数按值调用的特点（call by value）
 * java中方法不能修改基本数据类型的参数（数值型或者布尔型）
 * 方法可以改变对象参数的状态
 * 方法不能让一个对象参数引用一个新的对象
 * @Version 1.0.0
 * @Date 2022/4/7 10:36
 * @Created by deer-li
 */
public class ParamTest {
    public static void main(String[] args) {
        //1.方法不能修改数值参数
        System.out.println("Testing tripleValue:");
        double percent=10;
        System.out.println("Before :percent="+percent);
        tripleValue(percent);
        System.out.println("After :percent="+percent);
        //2.方法可以改变对象参数的状态
        System.out.println("\nTesting tripleSalary:");
        EmployeeCopy2 harry = new EmployeeCopy2("1", 2000);
        System.out.println("Before :salary="+harry.getSalary());
        tripleSalary(harry);
        System.out.println("After :salary="+harry.getSalary());
        //3.方法不能将新对象附加到对象参数,也正说明java方法不是按引用调用
        System.out.println("\nTesting swap:");
        EmployeeCopy2 a = new EmployeeCopy2("A", 100);
        EmployeeCopy2 b = new EmployeeCopy2("B", 200);
        System.out.println("Before :a="+a.getName());
        System.out.println("Before :b="+b.getName());
        swap(a,b);
        System.out.println("After :a="+a.getName());
        System.out.println("After :b="+b.getName());
    }

    private static void swap(EmployeeCopy2 x, EmployeeCopy2 y) {
        EmployeeCopy2 temp=x;
        x=y;
        y=temp;
        System.out.println("End of method: :x="+x.getName());
        System.out.println("End of method: :y="+y.getName());
    }

    private static void tripleSalary(EmployeeCopy2 x) {
        x.raiseSalary(200);
        System.out.println("End of method: x="+x.getSalary());
    }

    private static void tripleValue(double x) {
        x=3*x;
        System.out.println("End of method: x="+x);
    }
}
class EmployeeCopy2 {
    private String name;
    private double salary;
    public EmployeeCopy2(String n,double s){
        name=n;
        salary=s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }
}
