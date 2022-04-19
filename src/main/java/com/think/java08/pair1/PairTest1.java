package com.think.java08.pair1;


import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @Classname PairTest1
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/19 15:35
 * @Created by deer-li
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words={"Marry","had","a","little","thumb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min="+mm.getFirst());
        System.out.println("max="+mm.getSecond());
    }
}
class ArrayAlg{
    public static Pair<String> minmax(String[] a){
        if (a==null||a.length==0){
            return null;
        }
        String min=a[0];
        String max=a[0];
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
