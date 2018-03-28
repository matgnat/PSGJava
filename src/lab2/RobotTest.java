package lab2;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Objects;

/**
 * Created by magn on 3/21/2018.
 */
public class RobotTest {
    Robot robot;

    public RobotTest() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            System.out.println("Somthing went wrong");
            e.printStackTrace();
        }
    }

    public void printText() {

        int[] text = {KeyEvent.VK_H, KeyEvent.VK_E, KeyEvent.VK_L, KeyEvent.VK_L, KeyEvent.VK_O};
        for (int i = 0; i < text.length; i++) {
            robot.keyPress(text[i]);
            robot.delay(2000);
        }
    }

    public static void main(String[] args) {
        RobotTest robotTest = new RobotTest();
        //robotTest.printText();

        RobotTest robotNull = null;

        System.out.println(Objects.equals(robotTest,robotNull));
        System.out.println(Objects.toString(robotNull));
    }
}
