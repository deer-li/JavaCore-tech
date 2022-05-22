package com.think1.java02;
import java.util.Date;
//javadoc 命令可以生成API文档
/**
 * The first Think in java example program
 * Display a string and today's date.
 * @author Bruce Eckel
 * @version 4.0
 */
public class  annotationTohtml
{
    /**
     *Entrv point to class & application.
     *@param args array of String arguments.
     *@throws
     */
    public static void main(String[] args)
    {
        System.out.println("Hello, ist's: ");
        System.out.println(new Date());
    }
}