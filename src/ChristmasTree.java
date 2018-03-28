import java.util.*;
import java.util.List;

/**
 * Created by magn on 3/9/2018.
 */
@Deprecated
public class ChristmasTree {

    public static void main(String[] args) {

        //createTreeUp(10);
        //createTreeDown(10);
        //createTreeRight(10);
//        createTreeLeft(10);

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }
        System.out.println(l);

        Collections.sort(l,Collections.reverseOrder());

        System.out.println(l);

        Iterator<Integer> iterator = l.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(l.hashCode());

        Set<Integer> s = new LinkedHashSet<>();
        s.add(1);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        System.out.println(s);

        Integer[] i = s.toArray(new Integer[s.size()]);

        for (int i1: i
             )
            System.out.println(i1 + "<---");{

        }

        Map<Integer,String> myMap= new HashMap<>();

        for (int j = 0; j < 10; j++) {
            String k = String.valueOf(j);
            myMap.put(j, k);
        }

        System.out.println(myMap);

        for (int key: myMap.keySet()) {
            String value = myMap.get(key);
            System.out.println(key + " -> " + value);
        }

        for (Map.Entry<Integer, String> entries : myMap.entrySet()) {
            Integer h = entries.getKey();
            String k = entries.getValue();
            System.out.println(h + " --> " + k);
        }

        //ChristmasTree tree = new ChristmasTree();


    }

    public static void createTreeUp(int hight) {

        for (int level = 0; level < hight; level++) {
            for (int countSpace = 0; countSpace < hight - level; countSpace++)
                System.out.print(" ");
            for (int countStar = 0; countStar < (2 * level + 1); countStar++)
                System.out.print("*");
            System.out.println();
        }

    }

    public static void createTreeDown(int higth) {

        for (int level = 0; level < higth; level++) {
            for (int countSpace = 0; countSpace < level + 1; countSpace++)
                System.out.print(" ");
            for (int countStar = level * 2; countStar < higth * 2 - 1; countStar++)
                System.out.print("*");
            System.out.println();

        }
    }

    public static void createTreeRight(int hight) {
        //size = size/2 + 1;
        for (int level = 0; level < hight; level++) {
            for (int countStar = 0; countStar < level + 1; countStar++)
                System.out.print("*");
            System.out.println();
        }
        for (int level = 0; level < hight; level++) {
            for (int countStarBack = hight - 1; countStarBack > level; countStarBack--)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void createTreeLeft(int hight) {
        for (int level = 0; level < hight; level++) {
            for (int countSpace = 0; countSpace < hight - level; countSpace++)
                System.out.print(" ");
            for (int countStar = 0; countStar < level + 1; countStar++)
                System.out.print("*");
            System.out.println();
        }

        for (int level = 0; level < hight; level++) {
            for (int countSpace = 0; countSpace < level + 2; countSpace++)
                System.out.print(" ");
            for (int countStarBack = hight - 1; countStarBack > level; countStarBack--)
                System.out.print("*");
            System.out.println();
        }


    }
}