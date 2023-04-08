public class Main {
    public static void main(String[] args) {
        Player test = new Player(50, "Lucas", "Human", 5, 5);
        Zombie test1 = new Zombie(30, "Walking dead", "Human");
        System.out.println(test.toString());
        /*
        System.out.println(test.getHp());
        test.updateHp(26);
        System.out.println(test.getHp());
         */
        battle(test, test1);

    }

    static void battle(Player player, Zombie zombie){
        System.out.println("----------------------");
        System.out.println("Battle Phase");
        System.out.println("----------------------");

        player.attack(zombie.getDefence());

    }
}