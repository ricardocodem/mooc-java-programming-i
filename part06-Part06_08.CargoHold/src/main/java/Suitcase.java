
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo
 */
public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;
    private int itemWeight = 0;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {

        if (itemWeight + item.getWeight() <= maxWeight) {
            this.items.add(item);
            itemWeight += item.getWeight();
        }

    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item weight : items) {
            totalWeight += weight.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);

        for (Item heavy : this.items) {
            if (heaviest.getWeight() < heavy.getWeight()) {
                heaviest = heavy;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        if (items.size() == 1) {

            return items.size() + " item (" + itemWeight + " kg)";

        } else if (items.isEmpty()) {

            return "no items (" + itemWeight + " kg)";

        } else {

            return items.size() + " items (" + itemWeight + " kg)";

        }
    }
}
