package com.think.java03;

import java.util.Scanner;
/**
 * @Classname LotteryOdds
 * @Description for循环求中奖概率
 * @Version 1.0.0
 * @Date 2022/1/14 11:56
 * @Created by deer-li
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need to draw?");
        int k=in.nextInt();
        System.out.print("What is the highest number you can draw?");
        int n=in.nextInt();
        int lotterOdds=1;
        for (int i=1;i<=k;i++){
            lotterOdds=lotterOdds*(n-i+1)/i;
        }
        System.out.println("Your odds are 1 in "+lotterOdds+". Good luck!");
    }
}
