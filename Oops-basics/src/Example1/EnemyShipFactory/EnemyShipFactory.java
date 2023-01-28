package Example1.EnemyShipFactory;

import Example1.EnemyShip.EnemyShip;
import Example1.RocketEnemyShip.RocektEnemySHip;
import Example1.UfoEnmyShip.UfoEnemyShip;

public class EnemyShipFactory  {


    public EnemyShip makeEnemyShip(String name){
        if (name == "Ufo"){
            return new UfoEnemyShip();
        }

        return new RocektEnemySHip();


    }

}
