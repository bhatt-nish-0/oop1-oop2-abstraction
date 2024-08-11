public class EnhancedPlayer {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name,100,"Sword");
        //this.name = name;

    }
    public EnhancedPlayer(String name, int health, String weapon) {

        this.fullName = name;
        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        }else {
            this.healthPercentage = health;
        }
        //this.health = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;

        if (healthPercentage <= 0) {
            System.out.println("player knocked out of game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;

        if (healthPercentage > 100) {
            System.out.println("player restored to full health");
            healthPercentage = 100;
        }
    }
}
