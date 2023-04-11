public class Player {
    AttackStrategy attackStrategy;
    public void setAttackStrategy(AttackStrategy attackStrategy){
        this.attackStrategy=attackStrategy;
    }
    public void attackEnemy(String name){
        attackStrategy.attack(name);
    }
}
