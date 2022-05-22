package com.think1.java02;

public class ATypeName {
    int a=1,b=1;
    public int sum(){
        int i=a+b;
        return i;
    }
    public static void main(String[] args) {
        ATypeName aTypeName=new ATypeName();
        System.out.println(aTypeName.sum());
    }
}
