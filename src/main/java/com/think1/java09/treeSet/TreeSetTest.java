package com.think1.java09.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Classname TreeSetTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/5/2 15:52
 * @Created by deer-li
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Item> parts = new TreeSet<>();

        parts.add(new Item("Toaster",1234));
        parts.add(new Item("Widget",4562));
        parts.add(new Item("Modem",9912));
        //treeset，自己本身就是有序的默认排序
        System.out.println(parts);

        //通过定制比较器按照描述信息排序
        TreeSet<Item> sortByDes = new TreeSet<>(Comparator.comparing(Item::getDes));
        sortByDes.addAll(parts);
        System.out.println(sortByDes);
    }
}
