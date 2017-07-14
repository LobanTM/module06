package module06.PAbstractFactory;

/**
 * Created by tetya on 07.07.2017.
 */
public class USAddressFactory implements AddressFactory {
    @Override
    public USAddress createAddress() {
        return new USAddress();
    }

    @Override
    public USPhone createPhoneNumber() {
        return new USPhone();
    }
}
