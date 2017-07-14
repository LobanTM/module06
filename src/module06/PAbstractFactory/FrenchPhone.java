package module06.PAbstractFactory;

/**
 * Created by tetya on 07.07.2017.
 */
public class FrenchPhone extends PhoneNumber {
    public  static final String COD_COUNTRY = "(05)";

    public static String getCodCountry() {
        return COD_COUNTRY;
    }

    @Override
    public String getPhoneNumber() {
        return COD_COUNTRY + super.getPhoneNumber();
    }
}
