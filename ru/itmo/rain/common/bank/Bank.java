package ru.ifmo.rain.common.bank;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Bank extends Remote {

    public Account createAccount(String id)
            throws RemoteException;

    // Возвращает счет
    public Account getAccount(String id)
            throws RemoteException;

    // Создать счёт данному человеку
    public Account createPersonAccount(String accountName, Person remotePerson)
            throws RemoteException;

    // Создает запись о человеке
    public Person createPerson(String name, String surname, String passport)
            throws RemoteException;

    public Person getLocalPerson(String passport)
            throws RemoteException;

    public Person getRemotePerson(String passport)
            throws RemoteException;
}
