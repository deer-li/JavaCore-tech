package com.think1.java05.abstractClasses;

/**
 * @Classname Student
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/8 19:19
 * @Created by deer-li
 */
public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {

        return "a student majoring in "+major;
    }
}
