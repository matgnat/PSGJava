package desingpatterns.factory;

import java.util.Scanner;

/**
 * Created by magn on 3/27/2018.
 */
public class EnemyShipApp {


    public static void main(String[] args) {

        EnemyShip enemyShip = null;
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("JAKI SHIP: ... ?");

        if (scanner.hasNextLine()) {
            String kingOfShip = scanner.nextLine();
            enemyShip = enemyShipFactory.getEnemyShip(kingOfShip);
        }

        doStuffWithShip(enemyShip);

        System.out.println("A TERAZ...");
        if (scanner.hasNextLine()) {
            String kingOfShip = scanner.nextLine();
            enemyShip = enemyShipFactory.getEmenyFromEnum(kingOfShip);

        }

        doStuffWithShip(enemyShip);


    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void doStuffWithShip(EnemyShip enemyShip) {

        enemyShip.displayEnemyShip();
        enemyShip.enemyShipShoot();
        enemyShip.followHeroShip();
    }




}
