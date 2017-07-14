package module06.SAdapter;

/**
 * Created by tetya on 07.07.2017.
 */
public class AdaptSamsungToNokia implements Chageble {
    SamsungS3 samsungS3;

    public AdaptSamsungToNokia(SamsungS3 samS3) {
        this.samsungS3 = samS3;
    }

    @Override
    public void charge() {
        samsungS3.charge();
    }
}
