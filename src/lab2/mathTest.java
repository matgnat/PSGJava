package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by magn on 3/23/2018.
 */
public class mathTest {

    public static void main(String[] args) {
        System.out.println(Math.PI);
        int i = -10000;
        System.out.println( Math.abs(i));
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int j = 0; j < 100; j++) {
            //int value = (int) (random.nextDouble() * 1000);
            int value = random.nextInt(1001);

            list.add(value);
        }
        System.out.println(list);

        System.out.println(Math.max(1,2));
        int maxValue = 0;
        int max = 0;
        for (int j = 0; j < list.size(); j++) {
            try {
                max = Math.max(list.get(j), max);
            } catch (IndexOutOfBoundsException e) {

            }
        }

        System.out.println(max);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(0));

        Random rand = new Random();
        boolean check = rand.nextBoolean();

        Number number = (check || !check)?
                new Integer(1) : new Double(2.0);
        Integer wynik = (false||true)? 1:2;
        System.out.println(wynik);
        System.out.println("Wynik: "+number);

    }
}



