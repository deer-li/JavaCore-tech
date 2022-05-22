package com.think1.java02;
public class first {
    //验证Java的默认初始化的特性
    int i;
    char c;
    public first(){
        System.out.println("i="+i);
        System.out.println("c="+c);
    }
    public static void main(String[] args) {

        new first();
    }
}


