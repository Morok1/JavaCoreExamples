package example1;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    private static final String HOST = "localhost";
    private static final int PORT = 8080;
    private static Registry registry;

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        System.out.println("Starting!");

        try {
            registry = LocateRegistry.createRegistry(PORT);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        try {
            registry.bind(Worker.class.getSimpleName(), new QuickWorker());
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

        System.out.println("Server working!");
    }
}
