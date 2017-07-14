package module06.PAbstractFactory;

/**
 * Created by tetya on 07.07.2017.
 */
public class USAddress extends Address {
    public  static final String COUNTRY = "USA";

    public static String getCOUNTRY() {
        return COUNTRY;
    }

    @Override
    public String getFullAddress() {
        return COUNTRY + super.getFullAddress();
    }
}
