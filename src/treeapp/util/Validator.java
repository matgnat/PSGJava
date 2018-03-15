package treeapp.util;

import treeapp.run.CreateTreeApp;

import java.util.Scanner;

/**
 * Created by magn on 3/12/2018.
 */
public class Validator extends CreateTreeApp {

    public boolean isNumberFlag = false;
    public boolean isDirectionFlag = false;

    public int validateTreeHeight(Scanner scanner) {
        int positiveInt = 0;
        System.out.println("Insert height tree: ");
        do {
            if (scanner.hasNextInt()) {
                positiveInt = scanner.nextInt();
                if (positiveInt > 0) {
                    isNumberFlag = true;
                } else {
                    System.out.println(":) Try again!");
                    scanner.nextLine();
                }
            }
            else {
                System.out.println("You must insert a positive digit, max is 2147483647! ");
                scanner.nextLine();
            }


        } while (!(isNumberFlag));

        return positiveInt;
    }



    public void validateDirection(Scanner scanner) {
        do {
            if (scanner.hasNext("[UDRLudrl]{1}")) {
                isDirectionFlag = true;
            }
            //TODO
            /*else if (scanner.next("^null|$")) {
                System.out.println("Empty line");
            }*/
            else {
                System.out.println("You must insert direction: \nL for Left\nR for Right\nU for Up\nD for Down");
                scanner.next();
            }

        } while (!(isDirectionFlag));

    }

}
