/**
 * Created by magn on 3/9/2018.
 */
@Deprecated
public class ChristmasTree {

    public static void main(String[] args) {

        //createTreeUp(10);
        //createTreeDown(10);
        //createTreeRight(10);
        createTreeLeft(10);
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