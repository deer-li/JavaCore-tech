package com.think.java09.priorityQueue;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * @Classname PriorityQueueTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/5/7 14:32
 * @Created by deer-li
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1996,11,10));
        pq.add(LocalDate.of(1886,12,10));
        pq.add(LocalDate.of(1909,12,06));
        pq.add(LocalDate.of(1988,9,10));
        System.out.println("Iterating over elements ……");
        for (LocalDate date: pq){
            System.out.println(date);
        }
        System.out.println("Removing elements……");
        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
