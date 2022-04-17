package com.think.java06.anoymousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @Classname AnoymousInnerClassTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/4/14 15:35
 * @Created by deer-li
 */
public class AnoymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock();
        talkingClock.start(1000,true);
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }

}
class TalkingClock{
    public void start(int interval,boolean beep){
        ActionListener actionListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone,the time is " +Instant.ofEpochMilli(e.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer timer = new Timer(interval, actionListener);
        timer.start();
    }
}
