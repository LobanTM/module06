package module06.BIterator;

/**
 * Created by tetya on 10.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteCollection c = new ConcreteCollection();

        Iterator it = c.getIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
