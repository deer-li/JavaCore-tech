package com.think.java09.treeSet;

import java.util.Deque;
import java.util.Objects;

/**
 * @Classname Item
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/5/2 15:52
 * @Created by deer-li
 */
public class Item implements Comparable<Item> {
    private String des;
    private int  partNumber;

    public Item(String des, int partNumber) {
        this.des = des;
        this.partNumber = partNumber;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public String toString() {
        return "Item{" +
                "des='" + des + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(des,partNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return  true;
        if (obj==null) return  false;
        if (getClass()!=obj.getClass()) return false;
        Object other = (Item)obj;
        return Objects.equals(des,((Item) other).des) && partNumber==((Item) other).partNumber;
    }
    public int compareTo(Item other){
        int diff=Integer.compare(partNumber,other.partNumber);
        return diff!=0?diff:des.compareTo(other.des);
    }
}
