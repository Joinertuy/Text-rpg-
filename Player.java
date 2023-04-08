import Classes.Humanoid;

public class Player extends Humanoid {
    private int attackDamage;
    private int defence;

    public Player(int hp, String name, String race, int attackDamage, int defence) {
        super(hp, name, race);
        this.attackDamage = attackDamage;
        this.defence = defence;
    }

    public void updateHp(int x){
      int hp = getHp();
      hp = hp - x;
      setHp(hp);
    }
    public int attack(int x){
        x = this.attackDamage - x;
        return x;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    public int getDefence() {
        return defence;
    }
    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAttack Damage : " + attackDamage +
                "\nDefence : " + defence;
    }
}
