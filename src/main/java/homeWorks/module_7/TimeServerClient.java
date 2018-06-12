package homeWorks.module_7;

import java.util.Date;

public class TimeServerClient implements Client {

    private Date currentDate;

    private String clientName;

    Observable timeServer;

    public TimeServerClient(Observable timeServer, String clientName) {
        this.timeServer = timeServer;
        this.clientName = clientName;
    }

    @Override
    public <T> void update(T value) {
        this.currentDate = (Date) value;
        System.out.println(String.format("Client %s was received current time %s", clientName, currentDate));
    }
}
