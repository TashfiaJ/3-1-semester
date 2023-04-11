public class Main {
    public static void main(String[] args) {
        Player warrior = new Player();
        Player maze = new Player();
        Player archer = new Player();

        warrior.setAttackStrategy(new Warrior());
        maze.setAttackStrategy(new Maze());
        archer.setAttackStrategy(new Archer());

        warrior.attackEnemy("Dragon");
        maze.attackEnemy("Witch");
        archer.attackEnemy("Monkey");
    }
}
