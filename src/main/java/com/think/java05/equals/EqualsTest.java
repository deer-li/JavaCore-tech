package com.think.java05.equals;

/**
 * @Classname EqualsTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/10 9:18
 * @Created by deer-li
 */
public class EqualsTest {
    public static void main(String[] args) {
        Employee a1 = new Employee("1", 7500, 1990, 10, 10);
        Employee a2=a1;
        Employee a3 = new Employee("1", 7500, 1990, 10, 10);
        Employee bob = new Employee("bob", 5000, 1989, 10, 1);
        System.out.println("a1==a2:" +(a1==a2));
        System.out.println("a1==a3:" +(a1==a3));
        System.out.println("a1.equals(a3):"+a1.equals(a3));
        System.out.println("a1.euqals(bob)"+a1.equals(bob));
        System.out.println("bob.toString():"+bob);
        Manager cal = new Manager("3", 8000, 1992, 11, 10);
        Manager boss = new Manager("3", 8000, 1992, 11, 10);
        boss.setBonus(7000);
        System.out.println("boss.toString():"+boss);
        System.out.println("cal.equals(boss):"+cal.equals(boss));
        System.out.println("a1.hashcode():"+a1.hashcode());
        System.out.println("a3.hashcode():"+a3.hashcode());
        System.out.println("bob.hashcode():"+bob.hashcode());
        System.out.println("cal.hashcode():"+cal.hashcode());
    }
}
