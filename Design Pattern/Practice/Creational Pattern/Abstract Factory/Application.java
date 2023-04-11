public class Application {
    Enemy enemy;
    Weapon weapon;
     public Application(Creator creator){
         enemy = creator.createEnemy();
         weapon= creator.createWeapon();
     }

     public void playGame(){
         enemy.enemyType();
         weapon.weaponType();
     }
}
