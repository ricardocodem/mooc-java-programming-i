
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight = 0;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;

    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            totalWeight += suitcase.totalWeight();
            this.suitcases.add(suitcase);
        }
    }

    public void printItems() {

        for (int i = 0; i < this.suitcases.size(); i++) {
            suitcases.get(i).printItems();
        }

    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }

}
