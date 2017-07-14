package module06.PAbstractFactory;

/**
 * Created by tetya on 07.07.2017.
 * інтерфейс фабрики адрес
 */
public interface AddressFactory {
    public Address createAddress();
    public PhoneNumber createPhoneNumber();
}
