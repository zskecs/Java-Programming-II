/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author zsolt
 */
public class Not implements Criterion {

    private Criterion not;

    public Not(Criterion criteria) {

        not = criteria;

    }

    @Override
    public boolean complies(String line) {
        
        return !not.complies(line);
    }

}
