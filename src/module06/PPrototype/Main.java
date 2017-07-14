package module06.PPrototype;

/**
 * Created by tetya on 09.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Person man = new Person("Peter", "Thomas", "IELTS");
        System.out.println(man.toString());

        Prototype prototype = new Prototype(man);
        Person man2 = prototype.prototypePersone(true);
        System.out.println(man2.toString());

        //Prototype prototype2 = new Prototype(man);
        Person man3 = prototype.prototypePersone(false);
        man3.setFirstName("Olaph");
        man3.setLastName("Nickolson");
        System.out.println(man3.toString());

    }
}
