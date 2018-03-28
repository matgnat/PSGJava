package desingpatterns.singleton;

/**
 * Created by magn on 3/28/2018.
 */
public class Single {

    private static Single ourInstance = null;

    public static Single getInstance() {
        if (ourInstance == null) {
            ourInstance = new Single();
            System.out.println("Singleton creation");
        } else {
            System.out.println("Copy");
        }
        return ourInstance;
    }

    private Single() {
        System.out.println(this.hashCode());
    }
}
