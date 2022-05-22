package com.think1.java06.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * @Classname LambdaTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/13 15:01
 * @Created by deer-li
 */
//lambda表达式的书写格式
    // （parameters）-> 表达式
    // （parameters  *如果参数不止一个，就不能省略小括号* ）-> {statements *如果表达式不止一条，那就要外面的大括号*}
public class LambdaTest {
    public static void main(String[] args) {
        String[] plants = {"M1", "V11", "E122", "J1", "K2", "S44", "U55543", "N55666"};
        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(plants);
        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted by length:");
        Arrays.sort(plants,(first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(plants));
        Timer timer = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);
    }
}
