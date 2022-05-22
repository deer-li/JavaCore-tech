package com.think1.java02;

public class StorageTest {
    int storage(String s){
        return s.length();
    }
    public static void main(String[] args) {
        StorageTest s2=new StorageTest();
        String h="543";
        System.out.println(s2.storage(h));
    }
}
