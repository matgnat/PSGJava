package treeApp.util;

import treeApp.run.CreateTreeApp;

import java.util.Scanner;

/**
 * Created by magn on 3/12/2018.
 */
public class Validator extends CreateTreeApp {

    public boolean isNumberFlag = false;
    public boolean isDirectionFlag = false;

    public void validateTreeHeight(Scanner scanner) {
        do {
            if (scanner.hasNextInt()) {
                isNumberFlag = true;
            }
            //TODO
            /*else if (scanner.nextLine().isEmpty() || scanner.nextLine().length() == 0) {
                System.out.println("Cannot be empty, you must insert a digit! ");
                //scanner.next();
            }*/
            else {
                System.out.println("You must insert a digit! ");
                scanner.next();
            }


        } while (!(isNumberFlag));
    }


    public void validateDirection(Scanner scanner) {
        do {
            if (scanner.hasNext("[UDRLudrl]{1}")) {
                isDirectionFlag = true;
            }
            //TODO
            /*else if (scanner.next("^null|$")) {
                System.out.println("Empty line");
            }*/ else {
                System.out.println("You must insert direction: \nL for Left\nR for Right\nU for Up\nD for Down");
                scanner.next();
            }

        } while (!(isDirectionFlag));

    }

}
