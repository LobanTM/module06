package module06.BStrategy;

/**
 * Created by tetya on 10.07.2017.
 */
public class StrNew implements Strategy {
    @Override
    public int execute(int a, int b) {
        return 2*a + b;
    }
}
