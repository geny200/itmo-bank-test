package ru.ifmo.rain.common.bank;

import info.kgeorgiy.java.advanced.base.BaseTester;

public class Tester extends BaseTester {
    public static void main(final String... args) {
        new Tester().add("bank", BankTest.class).run(args);
    }
}
