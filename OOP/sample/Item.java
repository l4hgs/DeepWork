public class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    // to access and modify the
    // private properties
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }

    //runtime polymorphism (overriding)
    @Override
    public String toString() {
        return "Item: " + name + ", Quantity: " + quantity;
    }
}