package com.think.java08.pair1;

/**
 * @Classname Pair
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/19 15:39
 * @Created by deer-li
 */
//泛型类的定义格式
public class Pair<T> {
    private T first;
    private T second;
    public Pair(){
        first=null;
        second=null;
    }
    public Pair(T first, T second){
        this.first=first;
        this.second=second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }
}
