package module06.BStrategy;

/**
 * Created by tetya on 10.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new StrAdd());
        System.out.println(context.executeStrategy(134,23));

        context.setStrategy(new StrMinus());
        System.out.println(context.executeStrategy(134,23));

        context.setStrategy(new StrMultiply());
        System.out.println(context.executeStrategy(134,23));

        context.setStrategy(new StrNew());
        System.out.println(context.executeStrategy(134,23));
    }
}
