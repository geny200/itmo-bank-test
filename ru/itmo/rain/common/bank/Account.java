package ru.ifmo.rain.common.bank;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Account extends Remote {
    /**
     * @return {@link java.lang.String} - account identifier
     */
    String getId() throws RemoteException;

    /**
     * @return - money in the account
     */
    int getAmount() throws RemoteException;

    /**
     * @param amount - new amount of money in the account
     */
    void setAmount(int amount)
            throws RemoteException;
}
