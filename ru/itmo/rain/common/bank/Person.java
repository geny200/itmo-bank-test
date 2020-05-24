package ru.ifmo.rain.common.bank;

import ru.ifmo.rain._last_name_.bank.RemoteAccount;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Person extends Remote {

    String getSurname()
        throws RemoteException;

    String getPassport()
            throws RemoteException;

    String getName()
            throws RemoteException;

    Account getAccount(String accountName)
            throws RemoteException;

    void setAccount(RemoteAccount accountName)
            throws RemoteException;
}
