import java.util.ArrayList;

public class Inventory {
    // can store objects (not primitive)
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItems(Item item) {
        items.add(item);
    }

    public void addItems(String name, int quantity, String type) {
        items.add(new Fruit(type, name, quantity));
    }

    public void displayItem() {
        for (Item item: items) {
            System.out.println(item.toString());
        }
    }
}
