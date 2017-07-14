package module06.SBridge;

/**
 * Created by tetya on 11.07.2017.
 */
public class main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(new MarkaKia());
        Sedan sedan1 = new Sedan(new MarkaSkoda());

        sedan.showDetails();
        sedan1.showDetails();

        Couper couper = new Couper(new MarkaKia());
        Couper couper1 = new Couper(new MarkaSkoda());

        couper.showDetails();
        couper1.showDetails();
    }
}
