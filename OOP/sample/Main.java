public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item item1 = new Item("Apple", 5);
        Item item2 = new Item("Sword", 2);
        Fruit item3 = new Fruit("Fuji", "Banana", 3);
        Weapon item4 = new Weapon(50, "Rareee", "Katana", 1);

        inventory.addItems(item1);
        inventory.addItems(item2);
        inventory.addItems(item3);
        inventory.addItems(item4);


        inventory.displayItem();
    }
}
