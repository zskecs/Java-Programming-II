/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;


/**
 *
 * @author zsolt
 */
import java.util.*;
import  moving.domain.Box;
import  moving.domain.Thing;

public class Packer {
    
    private int boxesVolume;
    
    private List<Box> list;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.list = new ArrayList<Box>();
    }
    
    public List<Box> packThings(List<Thing> things) {
          Box box = new Box(this.boxesVolume);
        for (Thing t : things) {
            box.addThing(t);
            list.add(box);
        }
        return this.list;
    }
    
}
