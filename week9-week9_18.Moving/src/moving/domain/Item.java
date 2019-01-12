/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author zsolt
 */
public class Item implements Thing, Comparable<Item> {

    private final int volume;
    private final String name;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return this.name + " (" + volume + " dm^3)";
    }

    
    public int compareTo(Item comparable) {
        return this.volume - comparable.getVolume();
    }

}
