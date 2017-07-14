package module06.PPrototype;

/**
 * Created by tetya on 09.07.2017.
 */
public class Person implements Copyable{
    String firstName;
    String lastName;

    String organisation;

    public Person(String firstName, String lastName, String organisation){
        this.firstName = firstName;
        this.lastName = lastName;
        this.organisation = organisation;
    }

    public Person(){
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOrganisation() {
        return organisation;
    }


    @Override
    public String toString() {
        return firstName + " / " + lastName +" / " + organisation;
    }

    @Override
    public Object copy(boolean c) {
        Person copy = new Person("", "", organisation);
        if (c) {
            copy.setFirstName(firstName);
            copy.setLastName(lastName);
        }

        return copy;
    }
}
