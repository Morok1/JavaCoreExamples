import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Date;

public class WeatherServiceImpl extends UnicastRemoteObject implements WeatherService {
   private static final long serialVersionUID = 1L;

   protected WeatherServiceImpl() throws RemoteException {}

    @Override
    public synchronized WeatherData getWeatherData(Date date, String location) throws RemoteException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        if (dayOfWeek == 1 || dayOfWeek == 2) {
            if (location.equals(Constants.LOCATION_CHIKAGO))
                return new WeatherData(date, location, Constants.WEATHER_RAIN);
        } else if (location.equals(Constants.LOCATION_TOKIO)) {
            return new WeatherData(date, location, Constants.WEATHER_SUNNY);
        } else if (location.equals(Constants.LOCATION_HANOI)) {
            return new WeatherData(date, location, Constants.WEATHER_SUNNY);
        } else return new WeatherData(date, location, Constants.WEATHER_SUNNY);
        return null;
    }


}
