package com.think.java06.lambda;

/**
 * @Classname LambdaTest4
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/13 16:17
 * @Created by deer-li
 */
//可以直接在lambda表达式中访问外层的局部变量
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
