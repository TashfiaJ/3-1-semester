public class Level2Creator implements Creator{
    @Override
    public Enemy createEnemy() {
        return new GoblinEnemy();
    }

    @Override
    public Weapon createWeapon() {
        return new GunWeapon();
    }
}
