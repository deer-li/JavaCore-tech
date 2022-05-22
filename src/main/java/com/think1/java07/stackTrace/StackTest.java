package com.think1.java07.stackTrace;
import java.util.*;
/**
 * @Classname StackTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/18 14:51
 * @Created by deer-li
 */
public class StackTest
{
    /**
     * Computes the factorial of a number
     * @param n a non-negative integer
     * @return n! = 1 * 2 * . . . * n
     */
    public static int factorial(int n)
    {
        System.out.println("factorial(" + n + "):");
        StackWalker walker = StackWalker.getInstance();
        walker.forEach(System.out::println);//这里用到一个方法引用
        int r;
        if (n <= 1) r = 1;
        else r = n * factorial(n - 1);
        System.out.println("return " + r);
        return r;
    }
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            System.out.print("Enter n: ");
            int n = in.nextInt();
            factorial(n);
        }
    }
}
