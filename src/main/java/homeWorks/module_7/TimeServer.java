package homeWorks.module_7;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TimeServer implements Observable {

    private List<Client> clients = new ArrayList<>();

    private Date currentDate;

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
        clients.forEach(client -> client.update(currentDate));
    }

    @SneakyThrows
    public void process() {
        for (int i = 0; i < 5; i++) {
            currentDate = new Date();
            notifyClients();
            Thread.sleep(1000);
        }
    }
}
