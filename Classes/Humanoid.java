package Classes;

public class Humanoid {
    private int hp;
    private String name;
    private String race;

    public Humanoid(int hp, String name, String race){
        this.hp = hp;
        this.name = name;
        this.race = race;
    }

    @Override
    public String toString() {
        return "Health : " + hp +
                "\nName : " + name +
                "\nRace : " + race;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
}
