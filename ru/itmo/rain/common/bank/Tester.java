package ru.ifmo.rain.common.bank;

import info.kgeorgiy.java.advanced.base.BaseTester;

public class Tester extends BaseTester {
    // Тестирование
    // клиент: client <полное имя класса>
    // сервер: bank <полное имя класса>
    public static void main(final String... args) {
        new Tester().add("bank", BankTest.class).add("client", BankClientTest.class).run(args);
    }
}
