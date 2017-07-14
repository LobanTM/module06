package module06.SBridge;

/**
 * Created by tetya on 11.07.2017.
 */
abstract class Car {
    Marka marka;
    public Car (Marka m){
        this.marka = m;
    }

    abstract void showDetails();
}
