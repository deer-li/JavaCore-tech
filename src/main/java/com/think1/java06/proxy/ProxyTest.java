package com.think1.java06.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * @Classname ProxyTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/14 16:21
 * @Created by deer-li
 */

public class ProxyTest {
    public static void main(String[] args) {
        Object[] elements = new Object[1000];
        for (int i=0;i< elements.length;i++){
            Integer value=i+1;
            TraceHandler ha = new TraceHandler(value);
            //创建代理对象
            Object proxy = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Comparable.class}, ha);
            elements[i]=proxy;
        }
        int integer= new Random().nextInt(elements.length)+ 1;
        int result= Arrays.binarySearch(elements,integer);
        if (result>=0) {
            System.out.println(elements[result]);
        }
    }
}

class TraceHandler implements InvocationHandler{
    private Object target;
    public TraceHandler(Object t) {
        target=t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print(target);
        System.out.print("."+ method.getName()+"(");
        if (args!=null){
            for (int i=0;i<args.length;i++){
                System.out.print(args[i]);
                if (i<args.length-1){
                    System.out.print(", ");
                }
            }
        }
        System.out.println(")");
        return method.invoke(target,args);
    }
}
