package com.think.java02;

import static com.think.java02.animal.country;

//该类展示static关键字的共享属性，即一个类中，无论创建多少个对象，这个类中的static域只有一个实例
class  animal{
    String name;
    public int age;
    public static String country;
}
public class ImportantStatic {
    public static void main(String[] args) {
        animal a=new animal();
        animal.country="长江";
        animal b=new animal();
        animal.country="黄河";
        System.out.println(country.hashCode());
        System.out.println(a.country.hashCode());
        System.out.println(b.country.hashCode());
    }

}
