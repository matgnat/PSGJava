package treeApp.run;


import treeApp.feature.*;
import treeApp.util.Direction;
import treeApp.util.Validator;

import java.util.Scanner;

import static treeApp.util.Direction.valueOf;

/**
 * Created by magn on 3/14/2018.
 */
public class CreateTree {

    private static int inputTreeHeight;
    private static String inputDirection;

    public CreateTree() {
        inputTreeValue();
        directionOfCreateTree();
    }



    public void inputTreeValue() {
        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();

        System.out.println("Insert height tree: ");

        //validate input height value, must be int
        validator.validateTreeHeight(scanner);
        inputTreeHeight = scanner.nextInt();

        System.out.println("Insert direction: \nL for Left\nR for Right\nU for Up\nD for Down");
        //validate input height value, must be String from scope [UDLR]
        validator.validateDirection(scanner);
        inputDirection = scanner.next();
        inputDirection = inputDirection.toUpperCase();
    }

    public void directionOfCreateTree() {
        Direction direction = valueOf(inputDirection);

        switch (direction) {

            case L:
                TreeDrawing treeL = new TreeDrawingLeft(inputTreeHeight);
                break;
            case R:
                TreeDrawing treeR = new TreeDrawingRight(inputTreeHeight);
                break;
            case U:
                TreeDrawing treeU = new TreeDrawingUp(inputTreeHeight);
                break;
            case D:
                TreeDrawing treeD = new TreeDrawingDown(inputTreeHeight);
                break;
            default:
                System.out.println("error");


        }
    }
}
