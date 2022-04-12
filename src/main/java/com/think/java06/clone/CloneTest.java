package com.think.java06.clone;

/**
 * @Classname CloneTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/12 15:35
 * @Created by deer-li
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("!", 5000);
        original.setHireDay(1000,1,1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002,11,10);
        System.out.println("original="+original);
        System.out.println("copy="+copy);
    }

}

