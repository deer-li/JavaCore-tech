package com.think1.java02;

class StaticTest{
    static int i=41;
}
class InIncrementable{
    static int sum(){
        return StaticTest.i++;
    }
}
public class Incrementable {
    public static void main(String[] args) {
        System.out.println(InIncrementable.sum());
    }
}
