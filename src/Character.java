import java.util.Scanner;

public class Character {
    int hp = 10;
    String name;
    private Inventory backpack;

    public Character(){
        Scanner key = new Scanner(System.in);
        System.out.println("Welcome, hero. What is your name?");
        name = key.nextLine();
        backpack = new Inventory();
    }
}
