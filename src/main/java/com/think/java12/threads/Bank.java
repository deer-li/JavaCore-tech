package com.think.java12.threads;

import java.util.Arrays;

/**
 * @Classname Bank
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/5/14 11:04
 * @Created by deer-li
 */
public class Bank {
    private final double[] accounts;

    public Bank(int n,double initialBalance) {
        accounts=new double[n];
        Arrays.fill(accounts,initialBalance);
    }

    public void transfer(int from,int to,double amount){
        if (accounts[from]<amount) return;
        System.out.print(Thread.currentThread());
        accounts[from]-=amount;
        System.out.printf("%10.2f from %d to %d",amount,from,to);
        accounts[to]+=amount;
        System.out.printf("Total Balance: %10.2f%n",getTotalBalance());
    }

    private double getTotalBalance() {
        double sum=0;
        for (double a: accounts
             ) {
            sum+=a;
        }
        return sum;
    }
    public int size(){
        return accounts.length;
    }
}
