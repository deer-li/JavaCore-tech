package com.think.java05.abstractClasses;

/**
 * @Classname Person
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/8 19:09
 * @Created by deer-li
 */
public abstract class Person {
    public abstract String getDescription();

    private String name;
    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
