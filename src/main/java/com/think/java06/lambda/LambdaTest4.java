package com.think.java06.lambda;

/**
 * @Classname LambdaTest4
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/13 16:17
 * @Created by deer-li
 */
//可以直接在lambda表达式中访问外层的局部变量,同时应注意到该局部变量声明为final类型了，
    //lambda表达式访问的外层变量不能随时的发生变化，一旦初始化后，应该是固定的值。
    //也叫事实最终变量
public class LambdaTest4 {
    public static void main(String[] args) {
        final  int num=1;
        Convert<Integer,String> s=(param)-> System.out.println(String.valueOf(param+num));
        s.convert(2);
    }
    public interface  Convert<T1,T2>{
        void convert(int i);
    }
}
