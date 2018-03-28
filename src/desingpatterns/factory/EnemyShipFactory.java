package desingpatterns.factory;

import static java.lang.String.valueOf;

/**
 * Created by magn on 3/26/2018.
 */
public class EnemyShipFactory {

    //public String kindOfShip = null;

    public EnemyShip getEnemyShip(String kindOfShip) {
        EnemyShip enemyShip = null;

        if (kindOfShip.equals("R")) {
            return new Rockets();
        } else if (kindOfShip.equals("U")) {
            return new UFO();
        } else if (kindOfShip.equals("B")) {
            return new BigUFO();
        } else return null;

        /*switch (kindOfShip) {
            case kindOfShip.equals("R"): return new Rockets();
                break;
            case kindOfShip.equals("U"): return new UFO();
                break;
            case kindOfShip.equals("B"): return new BigUFO();
                break;
            default: return null;
        }*/



    }

    public EnemyShip getEmenyFromEnum(String kindOfShip) {

        Ship ship = Ship.valueOf(kindOfShip);

        switch (ship) {
            case UFO: return new UFO();
            case Rockets: return new Rockets();
            case BigUFO: return new BigUFO();
            default: return null;

        }

    }
}
