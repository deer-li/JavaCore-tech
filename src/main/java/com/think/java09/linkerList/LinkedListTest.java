package com.think.java09.linkerList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


/**
 * @Classname LinkedListTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/30 10:26
 * @Created by deer-li
 */
//调用next（）,指针索引到下一元素的头指针出，然后再执行remove（），会把此时指针前面的节点删除
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");
        LinkedList<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();
        while (bIter.hasNext()){
            if (aIter.hasNext()){
                //返回列表中的下一个元素并前进光标位置
                String testaIter=aIter.next();
            }
            String testbIter=bIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);
        bIter = b.iterator();
        while (bIter.hasNext()){
            bIter.next();
            if(bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);
        a.removeAll(b);
        System.out.println(a);
    }
}
