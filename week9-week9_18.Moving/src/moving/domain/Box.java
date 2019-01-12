/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.*;

/**
 *
 * @author zsolt
 */
public class Box implements Thing {

    private int maxCap;
    private List<Thing> list;

    public Box(int maximumCapacity) {
        maxCap = maximumCapacity;
        this.list = new ArrayList();
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + getVolume() <= this.maxCap) {
            list.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int sum = 0;
        for (Thing a : list) {
            sum += a.getVolume();
        }
        return sum;
    }
}
