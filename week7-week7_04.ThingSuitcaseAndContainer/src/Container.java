
import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> suitcases;
    private int limit;
    private int totalWeight;

    public Container(int maxWeight) {
        suitcases = new ArrayList<Suitcase>();
        this.limit = maxWeight;
        totalWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = suitcase.totalWeight();
        
        if (weight + this.totalWeight <= this.limit) {
            this.suitcases.add(suitcase);
            this.totalWeight += weight;
        }
    }
    
    public String toString() {
                if (this.suitcases.size() == 0) {
            return "empty (0 kg)";
        }
        if (this.suitcases.size() == 1) {
            return this.suitcases.size() + " suitcase (" + this.totalWeight + " kg)";
        }
        return this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }
    
    public void printThings() {
        
        for (Suitcase b : suitcases) {
            b.printThings();
        }
    }
}
