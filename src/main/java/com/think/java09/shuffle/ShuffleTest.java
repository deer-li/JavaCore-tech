package com.think.java09.shuffle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Classname ShuffleTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/5/13 10:20
 * @Created by deer-li
 */
public class ShuffleTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0;i<49;i++){
            numbers.add(i);
        }
        //shuffle方法是复制元素的作用
        Collections.shuffle(numbers);
        //subList()返回一个list的部分视图
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
