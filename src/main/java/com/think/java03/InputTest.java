package com.think.java03;

import java.util.Scanner;

/**
 * @Classname InputTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/1/13 20:44
 * @Created by deer-li
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //get first input
        System.out.println("What's your name?");
        String name = in.nextLine();
        //get second input
        System.out.println("How old are you?");
        int age = in.nextInt();
        System.out.println("Hello,"+name+",Next year,you'll be "+(age+1));
    }
}
