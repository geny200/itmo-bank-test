package ru.ifmo.rain.common.bank;

public interface BankServer extends AutoCloseable {
    //открывает RMI на порте port
    void start(int port);

    @Override
    void close();
}
