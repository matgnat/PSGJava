package lab2;

/**
 * Created by magn on 3/23/2018.
 */
public interface Animals {

    void makeSounds();

    public static void main(String[] args) {
        Animals dog = new Dog();
        Animals cat = new Cat();
        dog.makeSounds();
        cat.makeSounds();
    }
}
