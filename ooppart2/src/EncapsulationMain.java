public class EncapsulationMain {
    public static void main(String[] args) {
//        Player player = new Player();
//        //player.name = "time";
//        player.fullName = "time";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//
//        System.out.println(player.healthRemaining());
//
//        player.health = 200; //code gone rogue! should have called restoreHealth!
//
//        player.loseHealth(11);
//        System.out.println(player.healthRemaining());


        EnhancedPlayer tim  = new EnhancedPlayer("time");
        System.out.println(tim.healthRemaining());

        EnhancedPlayer tim1 = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println(tim1.healthRemaining());

        tim1.loseHealth(24);

        System.out.println(tim1.healthRemaining());

        //prevent calling code to go rogue
        //prevent calling code needing to change when the player classes change.
    }
}
