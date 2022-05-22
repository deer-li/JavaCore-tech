package com.think1.java09.sieve;

import java.util.BitSet;

/**
 * @Classname Sieve
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/5/13 10:30
 * @Created by deer-li
 */
public class Sieve {
    public static void main(String[] args) {
        int n=2000000;
        long start = System.currentTimeMillis();
        BitSet bitSet = new BitSet(n + 1);
        int count=0;
        int i;
        for (i=2;i<=n;i++){
            bitSet.set(i);
        }
        i=2;
        while(i*i<=n){
            if (bitSet.get(i)){
                count++;
                int k=2*i;
                while(k<=n){
                    bitSet.clear();
                    k+=i;
                }
            }
            i++;
        }
        while (i<=n){
            if(bitSet.get(i)){
                count++;
            }
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println(count+"primes");
        System.out.println((end-start)+"millseconds");
    }
}
