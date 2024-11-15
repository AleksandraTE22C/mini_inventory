import java.util.Scanner;

public class Character {
    private int hp = 10;
    String name;
    private Inventory backpack;

    public Character(){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your hero's name:");
        name = key.nextLine();
        backpack = new Inventory();
    }
}
