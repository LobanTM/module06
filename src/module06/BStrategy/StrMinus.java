package module06.BStrategy;

/**
 * Created by tetya on 10.07.2017.
 */
public class StrMinus implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
