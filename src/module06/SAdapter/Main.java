package module06.SAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tetya on 07.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        NokiaAha acha = new NokiaAha();
        NokiaLumia lum = new NokiaLumia();
        SamsungS3 samS3 = new SamsungS3();
        AdaptSamsungToNokia addaptSamS3 = new AdaptSamsungToNokia(samS3);

        List<Chageble> list = new ArrayList<>();
        list.add(acha);
        list.add(lum);
        list.add(addaptSamS3);

        for (Chageble c: list){
            c.charge();
        }
    }
}
