package com.think.java06.lambda;

/**
 * @Classname LambdaTest2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/13 15:41
 * @Created by deer-li
 */
//lambda表达式主要用来定义行内执行的方法类型接口，例如一个简单方法接口，
// 如下，我们使用各种类型的lambda表达式来定义MathOperation接口的方法，
// 然后我们定义了sayMessage的执行
public class LambdaTest2 {
    public static void main(String[] args) {
        LambdaTest2 tester = new LambdaTest2();
        MathOperation addition=(int a,int b)->a+b;
        MathOperation sub=(a,b)->a-b;
        MathOperation mul=(int a,int b)->{return  a*b ;};
        MathOperation div=(int a,int b)->a/b;
        System.out.println("11+10="+tester.operate(11,10,addition));
        System.out.println("11-10="+tester.operate(11,10,sub));
        System.out.println("11*10="+tester.operate(11,10,mul));
        System.out.println("11/10="+tester.operate(11,10,div));
        GreetingService gre=message -> System.out.println("Hello "+message);
        GreetingService gre2=(message) -> System.out.println("Hello "+message);
        gre.sayMessage("runoob");
        gre2.sayMessage("google");

    }
    //这是个接口，里面有返回值为整型值的方法，lambda表达式就是用来实现这样的接口的，
    //把参数传入接口中的方法参数列表中

    interface MathOperation{
        int operation(int a,int b);
    }

    interface GreetingService{
        void sayMessage(String say);
    }

    private int operate(int a,int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
