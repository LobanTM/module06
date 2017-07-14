package module06.BInterpreter;

/**
 * Created by tetya on 11.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Context cotext = new Context();
        Expression e = cotext.evaluate("123-100+200");
        System.out.println(e.interpret());
    }
}
