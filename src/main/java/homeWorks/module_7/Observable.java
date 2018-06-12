package homeWorks.module_7;

public interface Observable {

    void registerClient(Client client);

    void removeClient(Client client);

    void notifyClients();

    void process();
}
