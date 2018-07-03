import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface WeatherService extends Remote {
    public WeatherData getWeatherData(Date date, String location) throws RemoteException;
}
