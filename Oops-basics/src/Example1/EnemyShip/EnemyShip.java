package Example1.EnemyShip;

public abstract class EnemyShip {
    static String name = "" ;
    static  double amtDamage = 0.0 ;

    public void followHeroShip(){}

    public  void displayEnemyShip(){}

    public void enemyShipShoots(){}

    public void   setName(String name){
        EnemyShip.name = name;
    }
    public String getName(){
        return EnemyShip.name;
    }

    public void   setDamage(double dmg){
        EnemyShip.amtDamage = dmg;
    }
    public double getDamage(){
        return EnemyShip.amtDamage;
    }
}
