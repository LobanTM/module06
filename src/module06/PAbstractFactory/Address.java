package module06.PAbstractFactory;

/**
 * Created by tetya on 07.07.2017.
 */
public abstract class Address {
    String street;
    Integer home;
    public static final String SEPARATOR = " : ";

    public String getStreet() {
        return street;
    }

    public Integer getHome() {
        return home;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public String getFullAddress(){
        return SEPARATOR + street + SEPARATOR + home;
    }
}
