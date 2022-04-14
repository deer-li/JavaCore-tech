package com.think.java06.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @Classname InnerClassTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/14 14:58
 * @Created by deer-li
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }
}
class TalkingClock{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }
    public void start(){
        TimePrinter listener = new TimePrinter();
        Timer timer = new Timer(interval, listener);
        timer.start();
    }
    public class TimePrinter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone,the time is " +Instant.ofEpochMilli(e.getWhen()));
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
