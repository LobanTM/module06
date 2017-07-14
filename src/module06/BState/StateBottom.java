package module06.BState;

/**
 * Created by tetya on 10.07.2017.
 */
public class StateBottom implements State {
    @Override
    public void work() {
        System.out.println("Plane is on the earth");
    }
}
