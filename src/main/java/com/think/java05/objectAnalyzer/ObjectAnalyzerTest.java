package com.think.java05.objectAnalyzer;

import java.util.ArrayList;

/**
 * @Classname ObjectAnalyzerTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/11 15:16
 * @Created by deer-li
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) throws ReflectiveOperationException{
        ArrayList<Integer> squars = new ArrayList<>();
        for (int i=1;i<6;i++){
            squars.add(i*i);
        }
        System.out.println(new ObjectAnalyzer().toString(squars));
    }

}
