public class Main {
    public static void main(String[] args) {
        Player test = new Player(50, "Lucas", "Human", 7, 3);
        Zombie test1 = new Zombie(30, "Walking dead", "Human");

        Zombie[] horde = new Zombie[5];
        horde[0] = new Zombie(30, "Walking dead", "Human");
        horde[1] = new Zombie(30, "Walking dead", "Human");
        horde[2] = new Zombie(30, "Walking dead", "Human");


        System.out.println(test.toString());
        /*
        System.out.println(test.getHp());
        test.updateHp(26);
        System.out.println(test.getHp());
         */
        battlePhase(test, test1);

    }

    static void battlePhase(Player player, Zombie zombie){
        System.out.println("----------------------");
        System.out.println("-    Battle Phase    -");
        System.out.println("----------------------");
        boolean status = true;
        while(status){
            if(player.getHp() <= 0 || zombie.getHp() <= 0) {
                status = false;
                System.out.println("The battle is over!");
            }
            else {
                zombie.setHp((zombie.getHp()) - player.getAttackDamage());
                System.out.println("Player is attacking : zombie took " + player.getAttackDamage() + " damage");
                player.setHp(player.getHp() - zombie.getAttackDamage());
                System.out.println("Zombie attacked the player : Player took " + zombie.getAttackDamage() + " damage");

                System.out.println("Player Health :" + player.getHp() + " : " + "Zombie Health " + zombie.getHp() + "\n");
            }
        }

    }
}