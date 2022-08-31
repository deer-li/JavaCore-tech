package com.leetcode;

import java.util.Scanner;

/**
 * @Classname TwoSum
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/7/19 14:22
 * @Created by deer-li
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println("请输入5个数，并用逗号隔开：");
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.println(arr[i]+" ");
        }
    }
}
