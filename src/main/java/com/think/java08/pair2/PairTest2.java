package com.think.java08.pair2;

import com.think.java08.pair1.Pair;
import java.time.LocalDate;

/**
 * @Classname PairTest2
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/19 15:52
 * @Created by deer-li
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthday= {
                LocalDate.of(1908, 11, 10),
                LocalDate.of(1909, 11, 10),
                LocalDate.of(1910, 11, 10),

        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthday);
        System.out.println("min="+mm.getFirst());
        System.out.println("max="+mm.getSecond());
    }
}
class ArrayAlg{
    //泛型方法的定义格式
    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if (a==null||a.length==0){
            return null;
        }
        T min=a[0];
        T max=a[0];
        for (int i=0;i<a.length;i++){
            if (min.compareTo(a[i])>0){
                min=a[i];
            }
            if (min.compareTo(a[i])<0){
                max=a[i];
            }
        }
        return new Pair<>(min,max);

    }
}
//正确理解泛型擦除的概念
//：编译期间所有的泛型信息都会被擦掉，java实现泛型是在编译器层次上实现的，
//在生成的字节码中是不包含泛型中的类型信息的，使用泛型的时候加上类型参数，在编译器编译的时候会去掉，
