package ru.ifmo.rain.common.bank;

import java.rmi.RemoteException;

public interface BankClient extends AutoCloseable {
    // создаёт bank и открывает RMI на порте port
    void start(int port);

    // имя, фамилия, номер паспорта физического лица, номер счета, изменение суммы счета
    // возвращает состояние счёта
    int change(String name, String surname, String passport, String accountName, String modification) throws RemoteException;

    @Override
    void close();
}
