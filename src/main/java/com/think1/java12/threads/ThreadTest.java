package com.think1.java12.threads;

/**
 * @Classname ThreadTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/5/14 10:58
 * @Created by deer-li
 */
//单个程序可以同时完成多个任务，每个任务在一个线程中执行，这种程序就叫多线程程序
//多线程和多进程的本质就是多线程程序中各个任务共享数据，多进程是每个进程都拥有自己的一整套变量

public class ThreadTest {
    public static final int DELAY=10;
    public static final int STEPS=100;
    public static final double MAX_AMOUNT=1000;

    public static void main(String[] args) {
        Bank bank = new Bank(4, 100000);
        Runnable task1=()->
        {
            try{
                for (int i=0;i<STEPS;i++){
                    double amount=MAX_AMOUNT*Math.random();
                    bank.transfer(0,1,amount);
                    Thread.sleep((int)(DELAY*Math.random()));
                }
            }catch (InterruptedException e){

            }
        };

        Runnable task2=()->
        {
            try{
                for (int i=0;i<STEPS;i++){
                    double amount=MAX_AMOUNT*Math.random();
                    bank.transfer(2,3,amount);
                    Thread.sleep((int)(DELAY*Math.random()));
                }
            }catch (InterruptedException e){

            }
        };
        new Thread(task1).start();
        new Thread(task2).start();
    }
}
