package com.think.java03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Classname LotteryDrawing
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/1/16 15:44
 * @Created by deer-li
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need to draw?");
        int k=in.nextInt();
        System.out.print("What is the highest number you can draw?");
        int n =in.nextInt();
        int[] numbers = new int[n];
        for (int i=0;i<numbers.length;i++){
            numbers[i]=i+1;
        }
        int[] result = new int[k];
        for (int i=0;i<result.length;i++){
            int r=(int)(Math.random()*n);
            result[i]=numbers[r];
            numbers[r]=numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("I'll make you rich");
        for (int r:result){
            System.out.println(r);
        }
    }
}
