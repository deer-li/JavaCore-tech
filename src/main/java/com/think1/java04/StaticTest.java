package com.think1.java04;

/**
 * @Classname StaticTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/7 10:01
 * @Created by deer-li
 */
public class StaticTest {
    public static void main(String[] args) {
        EmployeeCopy[] staff = new EmployeeCopy[3];
        staff[0]=new EmployeeCopy("1",10000);
        staff[1]=new EmployeeCopy("2",20000);
        staff[2]=new EmployeeCopy("3",30000);
        for (EmployeeCopy e:staff){
            e.getId();
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
        int n=EmployeeCopy.getNextId();
        System.out.println("Next available id="+n);
    }
}
class EmployeeCopy{
    private static int nextId=1;//静态字段
    private String name;
    private double salary;
    private int id;
    public EmployeeCopy(String n,double s){
        name=n;
        salary=s;
        id=0;
    }

    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }


    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        EmployeeCopy e=new EmployeeCopy("Harry",5000);
        System.out.println( e.getName()+" "+e.getSalary());
    }
}
