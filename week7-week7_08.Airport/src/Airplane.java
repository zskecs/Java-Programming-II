
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zsolt
 */
public class Airplane {

    private HashMap<String, Integer> airplane;

    public Airplane() {
        airplane = new HashMap<String, Integer>();

    }

    public void add(String ID, Integer capacity) {
        airplane.put(ID, capacity);
    }

    public int capacity(String ID) {
        int value = 0;

        for (String key : airplane.keySet()) {

            if (key.equalsIgnoreCase(ID)) {
                value = airplane.get(key);
            }

        }
        return value;
    }

    public ArrayList<String> printPlanes() {

        ArrayList<String> printplanes = new ArrayList<String>();

        for (String key : airplane.keySet()) {
            int value = airplane.get(key);

            printplanes.add(key + " (" + value + " ppl)");
        }

        return printplanes;

    }

}
