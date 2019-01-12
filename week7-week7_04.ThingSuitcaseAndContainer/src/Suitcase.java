import java.util.*;

public class Suitcase {

    private ArrayList<Thing> things;
    private int limit;
    private int totalWeight;

    public Suitcase(int limit) {
        things = new ArrayList<Thing>();
        this.limit = limit;
        totalWeight = 0;

    }

    public void addThing(Thing thing) {

        int i = thing.getWeight();
        if (this.totalWeight + i <= this.limit) {
            this.things.add(thing);
            this.totalWeight += i;
        }
    }

    public String toString() {
//which returns a string in the form "x things (y kg)"
        if (this.things.size() == 0) {
            return "empty (0 kg)";
        }
        if (this.things.size() == 1) {
            return this.things.size() + " thing (" + this.totalWeight + " kg)";
        }
        return this.things.size() + " things (" + this.totalWeight + " kg)";

    }

    public void printThings() {
        for (Thing b : things) {

            System.out.println(b.toString());
        }
    }

    public int totalWeight() {

        return totalWeight;
    }

    public Thing heaviestThing() {

        if (things.size() > 0) {
            int heaviest = this.things.get(0).getWeight();

            for (Thing b : things) {
                if (b.getWeight() >= heaviest) {
                    heaviest = b.getWeight();
                }
            }
            for (Thing i : this.things) {
                if (i.getWeight() == heaviest) {
                    return i;
                }

            }
        }
        return null;
    }

}


