package com.think1.java02;
//包装器,自动包装功能就是装箱，拆箱。
public class packaging {
    public static void main(String[] args) {
        byte r = 8;
        int i = 32;
        float b = 0.2f;
        short t = 19;
        long l = 64;
        char c = 'c';
        double d = 0.64;
        boolean u = false;
        Byte by = new Byte(r);
        Integer it = new Integer(i);
        Float fl = new Float(b);
        Short sh = new Short(t);
        Long lo = new Long(l);
        Character ch = new Character(c);
        Double du = new Double(d);
        Boolean bl = new Boolean(u);
        System.out.println("boolean b = " + u);
        System.out.println("Boolean B = " + bl);
    }

}
