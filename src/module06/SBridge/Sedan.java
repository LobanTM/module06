package module06.SBridge;

/**
 * Created by tetya on 11.07.2017.
 */
public class Sedan extends  Car {
    public Sedan(Marka m) {
        super(m);
    }

    @Override
    void showDetails() {
        System.out.print("Sedan ");
        marka.setMarka();
    }
}
