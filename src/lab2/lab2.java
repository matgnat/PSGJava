package lab2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * Created by magn on 3/15/2018.
 */
public class lab2 {

    public static void main(String[] args) {

        Queue<String> queu = new ArrayDeque<>();

        queu.add("One");
        queu.add("Two");
        queu.add("Tree");

        System.out.println(queu.remove());
        System.out.println(queu.remove());
        System.out.println(queu.remove());
        System.out.println(queu);
    }
}
