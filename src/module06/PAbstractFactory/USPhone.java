package module06.PAbstractFactory;

/**
 * Created by tetya on 07.07.2017.
 */
public class USPhone extends PhoneNumber {
    public  static final String COD_COUNTRY = "(01)";

    public static String getCodCountry() {
        return COD_COUNTRY;
    }

    @Override
    public String getPhoneNumber() {
        return COD_COUNTRY + super.getPhoneNumber();
    }
}
