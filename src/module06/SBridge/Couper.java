package module06.SBridge;

/**
 * Created by tetya on 11.07.2017.
 */
public class Couper extends Car {
    public Couper(Marka m) {
        super(m);
    }

    @Override
    void showDetails() {
        System.out.print("Couper ");
        marka.setMarka();
    }
}
