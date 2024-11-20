import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("The adventure begins!");
        Character char1 = new Character();
        char1.backpack.display();
        System.out.println(char1.name + " before you lies a helmet. Do you want to pick it up? (Y/N)");
        String answer = key.nextLine();
        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            char1.backpack.items.add(new Armor("Rusty iron helmet", 2));
        }

    }
}