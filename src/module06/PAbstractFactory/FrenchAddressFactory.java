package module06.PAbstractFactory;

/**
 * Created by tetya on 07.07.2017.
 */
public class FrenchAddressFactory implements AddressFactory {
    @Override
    public Address createAddress() {
        return new FrenchAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new FrenchPhone();
    }
}
