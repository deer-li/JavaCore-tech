package com.think1.java03;

import java.util.Scanner;

/**
 * @Classname Retirement
 * @Description while循环
 * @Version 1.0.0
 * @Date 2022/1/13 21:04
 * @Created by deer-li
 */
public class Retirement {
    public static void main(String[] args) {
        //read input
        Scanner in = new Scanner(System.in);
        System.out.print("How much money do you need to retire?");
        double goal = in.nextDouble();
        System.out.print("How much money will you contribute every year?");
        double payment = in.nextDouble();
        System.out.print("Interest rate in %:");
        double interestRate = in.nextDouble();

        double balance=0;
        int years=0;
        while (balance<goal){
            balance=balance+payment;
            double interest=balance*interestRate/100;
            balance=balance+interest;
            years++;
        }
        System.out.println("You can retire in"+years+"years.");
    }
}
