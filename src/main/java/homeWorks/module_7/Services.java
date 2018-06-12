package homeWorks.module_7;

import lombok.SneakyThrows;

import java.util.stream.Stream;

public class Services {

    @SneakyThrows
    public static void main(String[] args) {
        Observable timeServer = new TimeServer();

        Client karl = new TimeServerClient(timeServer, "Karl");
        Client luci = new TimeServerClient(timeServer, "Luci");

        timeServer.registerClient(karl);
        timeServer.registerClient(luci);

        timeServer.process();

        Stream.generate(() -> "*").limit(100).forEach(System.out::print);
        System.out.println();

        Client geoStation = new WeatherServiceClient(timeServer, "GeoStation");
        Client railwayStation = new WeatherServiceClient(timeServer, "RailwayStation");

        Observable temp = new WeatherServer();

        temp.registerClient(geoStation);
        temp.registerClient(railwayStation);
        temp.process();
    }

}
