package com.think.java06.interfaces;

import java.util.Arrays;

/**
 * @Classname EmployeeSortTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/12 14:23
 * @Created by deer-li
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0]=new Employee("1",100000);
        staff[1]=new Employee("4",400000);
        staff[2]=new Employee("3",300000);
        Arrays.sort(staff);
        for (Employee e:staff){
            System.out.println("name="+e.getName()+",salary="+e.getSalary());
        }
    }
}
