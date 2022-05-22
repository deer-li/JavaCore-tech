package com.think1.java05.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Scanner;

/**
 * @Classname ReflectionTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/10 19:37
 * @Created by deer-li
 */

public class ReflectionTest {
    public static void main(String[] args) throws ReflectiveOperationException {
        String name;
        if (args.length>0) {
            name=args[0];
        }else {
            //从控制台获取输入
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date):");
            name=in.next();
        }
        //forName方法返回name所属的类
        Class cl = Class.forName(name);
        Class supercl = cl.getSuperclass();
        String m = Modifier.toString(cl.getModifiers());
        if (m.length()>0){
            System.out.print(m+" ");
        }

        System.out.print("class"+name);
        if (supercl!=null && supercl!=Objects.class){
            System.out.print("extends"+supercl.getName());
        }
        System.out.print("\n{\n");
        printConstructors(cl);
        System.out.println();
        printMethods(cl);
        System.out.println();
        printFields(cl);
        System.out.println("}");
    }

    private static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();
        for (Constructor c:constructors){
            String name = c.getName();
            System.out.print("  ");
            String modd = Modifier.toString(c.getModifiers());
            if (modd.length()>0){
                System.out.print(modd+" ");
            }
            System.out.print(name+"(");
            Class[] parameterTypes = c.getParameterTypes();
            for (int j=0;j<parameterTypes.length;j++){
                if (j>0){
                    System.out.print(",");
                }
                System.out.print(parameterTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    private static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        for (Method m:methods){
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.print("  ");
            String mod = Modifier.toString(m.getModifiers());
            if (mod.length()>0){
                System.out.print(mod+" ");
            }
            System.out.print(retType.getName()+" "+name+"(");
            Class[] parameterTypes = m.getParameterTypes();
            for (int j=0;j<parameterTypes.length;j++){
                if (j>0){
                    System.out.print(",");
                }
                System.out.print(parameterTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    private static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        for (Field f:fields){
            Class type = f.getType();
            String name = f.getName();
            System.out.print("   ");
            String mo = Modifier.toString(f.getModifiers());
            if (mo.length()>0){
                System.out.print(mo+" ");
            }
            System.out.println(type.getName()+" "+name+";");
        }
    }

}
