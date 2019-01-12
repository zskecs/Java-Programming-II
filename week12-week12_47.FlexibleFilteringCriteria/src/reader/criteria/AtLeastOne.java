/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.*;

/**
 *
 * @author zsolt
 */
public class AtLeastOne implements Criterion {

    private List<Criterion> list;
    private boolean bool = false;

    public AtLeastOne(Criterion... criteria) {

        list = new ArrayList<Criterion>();
        list.addAll(Arrays.asList(criteria));
    }

    @Override
    public boolean complies(String line) {
        for (Criterion b : list) {
            if(b.complies(line)) {
                bool = true;
                return bool;
            }
            

        }

        return false;
    }

}
