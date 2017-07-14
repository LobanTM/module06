package module06.PFactoryMethod;

/**
 * Created by tetya on 09.07.2017.
 */
public class Factory {
    Client client;

    public Client getClient(String idOS) {
        if (idOS.equals("win")){client = new ClientWin();}
        if (idOS.equals("linux")){client = new ClientLinux();}
        return client;
    }
}
