package module06.BObserver;

/**
 * Created by tetya on 10.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        ConcretObserved site = new ConcretObserved();

        site.addEvant("JAVA cource");
        site.addEvant("vocation");

        Observer man1 = new ConcretObserver("Nick");
        Observer man2 = new ConcretObserver("Thomas");

        site.addObserver(man1);
        site.addObserver(man2);

        site.addEvant("new webinar");
        site.addEvant("concert of Sting");
        site.addEvant("vocation");
        //повідомлення кожного разу видає весь перелік
    }
}
