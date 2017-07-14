package module06.PAbstractFactory;

/**
 * Created by tetya on 07.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        //створити фабрику
        AddressFactory uSF = new USAddressFactory();
        AddressFactory frF = new FrenchAddressFactory();

        //створити обєкти
        Address ua = uSF.createAddress();
        PhoneNumber up = uSF.createPhoneNumber();
        Address fa = frF.createAddress();
        PhoneNumber fp = frF.createPhoneNumber();


        //заповнити обєкти
        ua.setStreet("Main");
        ua.setHome(5);
        up.setPhoneNumber("123456789");
        fa.setStreet("Champ d'Elise");
        fa.setHome(1);
        fp.setPhoneNumber("987654");
        //вивести результати
        System.out.println(ua.getFullAddress() + "   ??   " + up.getPhoneNumber());
        System.out.println(fa.getFullAddress() + "   ??   " + fp.getPhoneNumber());

    }
}
