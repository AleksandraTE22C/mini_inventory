public class Consumable extends Item {
    private int maxUses;
    private int currentUses = 0;

    public Consumable(String name, int maxUses) {
        this.maxUses = maxUses;
        this.name = name;
    }

    public void use(Character target) {
        if (currentUses < maxUses) {
            System.out.println(target.name + " uses " + this.name + ".");
            target.hp += 7;
            currentUses++;


            if (currentUses >= maxUses) {
                this.name = "Empty bottle";
            }
        } else {
            System.out.println(this.name + " cannot be used.");
        }
    }
}
