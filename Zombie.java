import Classes.Humanoid;

public class Zombie extends Humanoid {
    private int attackDamage = 4;
    private int defence = 5;

    public Zombie(int hp, String name, String race) {
        super(hp, name, race);
    }

    public void updateHp(int x){
        int hp = getHp();
        hp = hp - x;
        setHp(hp);
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getDefence() {
        return defence;
    }
}
