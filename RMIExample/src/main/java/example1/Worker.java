package example1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Worker extends Remote {
    public void doWork(int count) throws RemoteException;
}
