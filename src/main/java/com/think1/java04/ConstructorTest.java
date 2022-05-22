package com.think1.java04;

import java.util.Random;

/**
 * @Classname ConstructorTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/7 14:09
 * @Created by deer-li
 */
public class ConstructorTest {
    public static void main(String[] args) {
        EmployeeCopy3[] staff = new EmployeeCopy3[3];
        staff[0] = new EmployeeCopy3("1", 1000);
        staff[1] = new EmployeeCopy3(2000);
        staff[2] = new EmployeeCopy3();
        for (EmployeeCopy3 e: staff){
            System.out.println("id="+e.getId()+",name="+e.getName()+",salary="+e.getSalary());
        }
    }
}
class EmployeeCopy3{
    private static int nextId;
    private int id;
    private String name="";
    private double salary;
    //静态初始化代码块
    static {
        Random generator = new Random();
        nextId=generator.nextInt(10000);
    }
    //初始化块
    {
        id=nextId;
        nextId++;
    }
    public EmployeeCopy3(String n,double s){
        name=n;
        salary=s;
    }
    public EmployeeCopy3(double s){
        this("Employee#"+nextId,s);
    }
    public EmployeeCopy3(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
