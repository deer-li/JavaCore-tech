package com.think1.java06.staticInnerClass;

/**
 * @Classname StaticInnerClassTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/14 15:46
 * @Created by deer-li
 */

public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] values = new double[20];
        for (int i=0;i<values.length;i++){
            values[i]=100*Math.random();
        }
        ArrayAlg.Pair pair=ArrayAlg.minmax(values);
        System.out.println("min="+pair.getFirst());
        System.out.println("max="+pair.getSecond());
    }
}
class ArrayAlg {
    public static class Pair {
        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }
    public static Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min, max);
    }
}