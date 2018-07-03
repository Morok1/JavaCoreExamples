import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;

public class Client {
    private static final String HOST = "localhost";
    private static final int PORT = 1993;
    private static Registry registry;

    public static void main(String[] args) throws RemoteException, NotBoundException {
        WeatherService service = null;
        try {
            registry = LocateRegistry.getRegistry(HOST, PORT);
            service = (WeatherService) registry.lookup(WeatherService.class.getSimpleName());
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }

        Date today = new Date();
        WeatherData weatherCHICAGO = service.getWeatherData(today, Constants.LOCATION_CHIKAGO);
        System.out.println("ChickagoWeather" + weatherCHICAGO.getWeather());
        WeatherData weatherHanoi = service.getWeatherData(today, Constants.LOCATION_HANOI);

        System.out.println("Hanoi weather today" + weatherHanoi.getWeather());
    }
}
