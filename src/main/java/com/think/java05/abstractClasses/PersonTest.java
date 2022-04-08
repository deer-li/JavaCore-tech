package com.think.java05.abstractClasses;

/**
 * @Classname PersonTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/8 19:22
 * @Created by deer-li
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("1", 500, 1999, 10, 1);
        people[1] = new Student("2", "computer");
        for (Person p:people) {
            System.out.println(p.getName()+","+p.getDescription());
        }
    }
}
