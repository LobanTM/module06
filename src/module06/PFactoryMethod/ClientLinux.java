package module06.PFactoryMethod;

/**
 * Created by tetya on 09.07.2017.
 */
public class ClientLinux implements Client {
    @Override
    public String getTargetOS() {
        return "LINUX";
    }
}
