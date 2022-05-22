package com.think1.java05.abstractClasses;

/**
 * @Classname Person
 * @Description 同时对本小节的访问控制修饰符做一个总结
 * private 仅仅对本类可见。
 * public 对外部完全可见。
 * protected 对本包中的类和所有子类可见
 * default 默认不需要修饰符修饰
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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
