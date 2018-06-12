package homeWorks.module_7;

import com.github.fedy2.weather.data.Atmosphere;

public class WeatherServiceClient implements Client {

    private Atmosphere currentTemperature;

    private String clientName;

    Observable weatherServer;

    public WeatherServiceClient(Observable weatherServer, String clientName) {
        this.weatherServer = weatherServer;
        this.clientName = clientName;
    }

    @Override
    public <T> void update(T value) {
        this.currentTemperature = (Atmosphere) value;
        System.out.println(String.format("Client %s was received current meteo data %s", clientName, currentTemperature));
    }
}
