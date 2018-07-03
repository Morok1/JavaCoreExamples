package example1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class QuickWorker extends UnicastRemoteObject implements Worker {
    public static final long serialVersionUID = 1L;

    protected QuickWorker() throws RemoteException {
    }

    @Override
    public void doWork(int count) {
        System.out.println("Do work for " + count);
    }
}
