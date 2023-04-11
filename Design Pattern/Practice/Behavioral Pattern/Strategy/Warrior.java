public class Warrior implements AttackStrategy{
    @Override
    public void attack(String name) {
        System.out.println("Player has chosen sword and attacked "+name);
    }
}
