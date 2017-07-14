package module06.BVisitor;

/**
 * Created by tetya on 10.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Element eA = new ElementA();
        Element eB = new ElementB();
        Element eC = new ElementC();

        Visitor man = new VisitorOne();
        eA.accept(man);
        eB.accept(man);

        Visitor woman = new VisitorTwo();
        eA.accept(woman);
    }
}
