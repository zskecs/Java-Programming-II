/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import reference.domain.Person;
import java.util.Comparator;
import java.util.Map;

/**
 *
 * @author zsolt
 */
public class PersonComparator implements Comparator<Person>{
    
    private Map<Person, Integer> peopleIdentities;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
    }

    @Override
    public int compare(Person t, Person t1) {
         return peopleIdentities.get(t1).compareTo(peopleIdentities.get(t));
    }
    
    
   
    

}
