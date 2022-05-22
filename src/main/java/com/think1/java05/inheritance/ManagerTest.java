package com.think1.java05.inheritance;

/**
 * @Classname ManagerTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/7 14:48
 * @Created by deer-li
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("1",1000.0,1998,02,06);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        staff[0]=new Employee("2",3000,1998,04,05);
        staff[1]=new Employee("3",8000,1998,04,05);
        staff[2]=boss;
        for (Employee e:staff) {
            System.out.println("name="+e.getName()+",salary="+e.getSalary());

        }




    }
}
