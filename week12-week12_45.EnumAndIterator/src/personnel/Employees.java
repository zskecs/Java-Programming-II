/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author zsolt
 */
public class Employees {

    private List<Person> employees = new ArrayList();

    public Employees() {
    }

    public void add(Person person) {

        employees.add(person);

    }

    public void add(List<Person> persons) {
        employees.addAll(persons);

    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

    }

    public void print(Education education) {

        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {

            Person person = iterator.next();

            if (person.getEducation() == education) {

                System.out.println(person);

            }

        }
    }

    public void fire(Education education) {
        
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            
            Person person = iterator.next();

            if (person.getEducation() == education) {

                iterator.remove();
            }

        }
    }

}
