package module06.BInterpreter;

/**
 * Created by tetya on 11.07.2017.
 */
public class NumberExpression implements Expression {
    int number;
    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
