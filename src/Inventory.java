import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();

    public Inventory() {
        items.add(new Weapon("Sword", 15));
        items.add(new Consumable("Healing potion", 2));
    }
    public void display(){
        System.out.println("Backpack:");
        for (Item item : items){
            System.out.println(item.name);
        }
    }


}
