public class Consumable extends Item{
    private int maxUses;
    private int currentUses;

    public Consumable(String name, int maxUses){
        this.maxUses = maxUses;
        this.name = name;
    }
    public void use(Character target){
        if(currentUses < maxUses){
            System.out.println(target.name + " uses " + this.name + ".");
        }
    }
}
