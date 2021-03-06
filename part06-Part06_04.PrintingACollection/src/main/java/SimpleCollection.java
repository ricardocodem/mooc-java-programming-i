
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {

        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        String collectionElements = "";
        String elementsDescription = "";
        if (this.elements.size() == 1) {
            collectionElements = "The collection " + this.name + " has " + this.elements.size() + " element:";
            elementsDescription = this.elements.get(0);
        } else {
            collectionElements = "The collection " + this.name + " has " + this.elements.size() + " elements:";
            for (String quant : elements) {
                elementsDescription = elementsDescription + quant + "\n";
            }
        }

        return collectionElements + "\n" + elementsDescription;
    }
}
