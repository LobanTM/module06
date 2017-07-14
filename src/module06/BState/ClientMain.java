package module06.BState;

/**
 * Created by tetya on 10.07.2017.
 */
public class ClientMain {
    public static void main(String[] args) {
        CotextPlane plane = new CotextPlane();
        State state1 = new StateFlight();
        State state2 = new StateBottom();

        plane.setState(state1);
        plane.doWork();

        //одні й ті самі дії призводять до різного результату, в залежності від стану Context'у
        plane.changeState();
        plane.doWork();

        plane.changeState();
        plane.doWork();

        plane.changeState();
        plane.doWork();
    }
}
