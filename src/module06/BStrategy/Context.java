package module06.BStrategy;

/**
 * Created by tetya on 10.07.2017.
 */
public class Context {
    private Strategy strategy;

    public Context() {}

    public void setStrategy (Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int a, int b){
        return strategy.execute(a,b);
    }
}
