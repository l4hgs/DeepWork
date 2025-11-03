public class Weapon extends Item {
    private String affinity;
    private int damage;

    public Weapon(int damage, String affinity, String name, int quantity) {
        super(name, quantity);
        this.affinity = affinity;
        this.damage = damage;
    }

    public String getAffinity() {
        return affinity;
    }
    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Affinity: " + getAffinity() + ", Damage: " + getDamage();
    }
}
