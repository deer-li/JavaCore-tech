package com.think1.java03;

import java.util.Scanner;

/**
 * @Classname Retirement2
 * @Description do …… while  循环
 * @Version 1.0.0
 * @Date 2022/1/14 11:42
 * @Created by deer-li
 */
public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How much money will you contribute every year?");
        double payment = in.nextDouble();
        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();
        double balance = 0;
        int year = 0;
        String input;
        do {
            balance = balance + payment;
            double interest = balance * interestRate / 100;
            balance = balance + interest;
            year++;
            System.out.printf("After year %d, your balance is %.2f%n", year, balance);
            System.out.print("Ready to retire?(Y/N) ");
            input = in.next();
        } while (input.equals("N"));
    }
}
