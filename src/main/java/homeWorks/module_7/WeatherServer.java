package homeWorks.module_7;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class WeatherServer implements Observable {

    private List<Client> clients = new ArrayList<>();

    private Channel channel = null;

    @Override
    public void registerClient(Client client) {
        clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        clients.remove(client);
    }

    @Override
    public void notifyClients() {
        clients.forEach(client -> client.update(channel.getAtmosphere()));
    }

    @SneakyThrows
    @Override
    public void process() {
        YahooWeatherService service = new YahooWeatherService();
        channel = service.getForecast("2502265", DegreeUnit.CELSIUS);
        notifyClients();
    }
}
