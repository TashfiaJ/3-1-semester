public class Level1Creator implements Creator{

    @Override
    public Enemy createEnemy() {
        return new GhostEnemy();
    }

    @Override
    public Weapon createWeapon() {
        return new SwordWeapon();
    }
}
