import java.util.Random;

public class Weapon extends Item{
    private int minDmg = 2;
    private int maxDmg;
    private Random rand = new Random();

    public Weapon(String name, int maxDmg){
        this.maxDmg = maxDmg;
        this.name = name;
    }

    public void attack(){
        //Adds a 12% chance for the attack to miss.
        if(rand.nextInt(100) < 12){
            System.out.println("The attack missed!");
            return;
        }

        //Deals a random amount of damage within the values of the maximum damage and minimum damage of the equipped weapon.
        int damage = rand.nextInt(maxDmg - minDmg) + minDmg;
        System.out.println("You attacked the enemy and did " + damage + " damage!");

    }
}