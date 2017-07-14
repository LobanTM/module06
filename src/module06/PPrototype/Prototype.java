package module06.PPrototype;

/**
 * Created by tetya on 09.07.2017.
 */
public class Prototype {
    Person person;
    boolean copyVolume; //true - повне чи false - неповне копіювання

    public Prototype (Person p){
        this.person = p;
    }

    public void setPerson(Person p) {
        this.person = p;
    }

    Person prototypePersone(boolean cc){
        return (Person) person.copy(cc);
    }
}
