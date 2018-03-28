import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Character.isDigit;

/**
 * Created by magn on 3/19/2018.
 */
@Deprecated
public class Osoba {

    private String name;
    private String lastName;

    public Osoba(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {

        List<Osoba> osoba = new ArrayList<>();
        osoba.add(new Osoba("John", "Smith"));
        osoba.add(new Osoba("James", "Dean"));

        for (int i = 0; i < osoba.size(); i++) {
            System.out.println(osoba.get(i).getLastName() + " " + osoba.get(i).getName());

        }

        Collections.sort(osoba, (Osoba o1, Osoba o2) -> o1.getName().compareTo(o2.getName()));


        for (int i = 0; i < osoba.size(); i++) {
            System.out.println(osoba.get(i).getLastName() + " " + osoba.get(i).getName());

        }

        Map<Integer, String> myMap = new LinkedHashMap<>();

        for (int i = 0; i < 100; i++) {
            myMap.put(i, String.valueOf(i));
        }

        System.out.println(myMap);

        for (Map.Entry<Integer, String> entries : myMap.entrySet()) {
            System.out.println("key --> " + entries.getKey());
            System.out.println("value --> " + entries.getValue());
        }

        for (int i = 0; i < myMap.size(); i++) {
            System.out.println("key ++ " + myMap.keySet());
            System.out.println("value ++ " + myMap.get(i));
        }

        Set<Integer> intKey = myMap.keySet();
        System.out.println(intKey);
        Collection<String> values = myMap.values();
        System.out.println(values);


        List<Integer> listInt = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            listInt.add(i);
        }

        System.out.println(listInt);

        Collections.sort(listInt);

        System.out.println(listInt);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cyfre");

        /*boolean flag = false;

        while (!flag) {
            String s = scanner.next();
            System.out.println(s.length());
            if (s.length() == 1 && Character.isDigit(s.charAt(0))) {
                System.out.println("OK");
                flag = true;
            } else {
                System.out.println("WRONG");
                scanner.nextLine();
            }

        }*/
        String s = "232323";
        System.out.println(Integer.parseInt(s));

        Integer a = 10000;
        Integer b = 10000;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        List<String> strings = Arrays.asList("John", "Mark");
        for (String t: strings
             ) {
            System.out.println(t);

        }


    }


}
