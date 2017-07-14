package module06.BState;

/**
 * Created by tetya on 10.07.2017.
 */
public class CotextPlane {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void changeState(){
        if (state instanceof StateFlight){
            setState(new StateBottom());
        } else if (state instanceof StateBottom) {
            setState(new StateNew());
            }else setState(new StateFlight());
    }

    public void doWork(){
        state.work();
    }

}
