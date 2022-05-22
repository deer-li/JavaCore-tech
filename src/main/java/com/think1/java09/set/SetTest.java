package com.think1.java09.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


/**
 * @Classname SetTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/5/2 15:11
 * @Created by deer-li
 */
public class SetTest {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        long totalTime=0;
        try (Scanner in = new Scanner(System.in)){
            while(in.hasNext()){
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime=System.currentTimeMillis()-callTime;
                totalTime+=callTime;
            }
        }
        Iterator<String> iter = words.iterator();
        for (int i=1;i<=20&&iter.hasNext();i++){
            System.out.println(iter.next());
        }
        System.out.println("……");
        System.out.println(words.size()+" distinct words. "+totalTime+" MillSeconds");


    }
}
