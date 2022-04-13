package com.think.java06.lambda;

/**
 * @Classname LambdaTest3
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/13 16:14
 * @Created by deer-li
 */
//演示lambda表达式的作用域
    //1.只能引用标记了final的外层局部变量，不能在lambda内部修改定义在域外的局部变量
public class LambdaTest3 {
    public static String salutation="Hello !";
    public static void main(String[] args) {
        Free fre=mes -> System.out.println(salutation+mes);
        fre.say("google");
    }
    interface Free{
        void say(String mes);
    }
}
