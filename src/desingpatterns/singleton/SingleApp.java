package desingpatterns.singleton;

/**
 * Created by magn on 3/28/2018.
 */
public class SingleApp {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        Single s3 = Single.getInstance();
        Single s4 = Single.getInstance();

    }
}
