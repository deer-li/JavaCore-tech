package com.think1.java12.unsynch;

import com.think1.java12.threads.Bank;

/**
 * @Classname UnsynchBankTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/5/14 18:13
 * @Created by deer-li
 */
public class UnsynchBankTest {
    public static final int NACCOUNTS=100;

    public static final double INITIAL_BALANCE=1000;

    public static final double MAX_AMONT=1000;

    public static final int DELAY=10;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);

    }
}
