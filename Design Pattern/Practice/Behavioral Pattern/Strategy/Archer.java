public class Archer implements AttackStrategy{
    @Override
    public void attack(String name) {
        System.out.println("Player has chosen arrow and attacked "+name);
    }
}
