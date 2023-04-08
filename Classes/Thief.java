package Classes;

public class Thief extends Humanoid{
    private double attackDamage = 15.0;
    private double defence = 5;
    private double dexterity = 10.0;
    private double mana = 0;
    private double stamina = 20;

    public Thief(int hp, String name, String race) {
        super(hp, name, race);
    }


        public double stealthAttack(double x){
            x =  (attackDamage + ((attackDamage + dexterity)/dexterity));   // dAMAGE STEALTH ATTACK WILL DEAL
            return x;
        }

        public double block(double enemyAttack){
        enemyAttack = enemyAttack/(defence*0.5);    // The damage the enemy attack will deal to the character
        return enemyAttack;
        }



    public double getAttackDamage() {
        return attackDamage;
    }
    public double getDefence() {
        return defence;
    }
    public double getDexterity() {
        return dexterity;
    }
    public double getMana() {
        return mana;
    }
    public double getStamina() {
        return stamina;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }
    public void setDefence(double defence) {
        this.defence = defence;
    }
    public void setDexterity(double dexterity) {
        this.dexterity = dexterity;
    }
    public void setMana(double mana) {
        this.mana = mana;
    }
    public void setStamina(double stamina) {
        this.stamina = stamina;
    }
}
