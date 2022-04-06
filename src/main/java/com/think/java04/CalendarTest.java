package com.think.java04;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
/**
 * @Classname CalendarTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/1/21 16:18
 * @Created by deer-li
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month=date.getMonthValue();
        int today=date.getDayOfMonth();
        date=date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value=weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i=1;i<value;i++){
            System.out.print("    ");
        }
        while (date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth()==today){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            date=date.plusDays(1);
            if (date.getDayOfWeek().getValue()==1) System.out.println();
        }
        if (date.getDayOfWeek().getValue()!=1) System.out.println();

    }
}
