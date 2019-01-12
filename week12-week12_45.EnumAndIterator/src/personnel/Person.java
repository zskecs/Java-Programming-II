/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author zsolt
 */
public class Person {
    
    private Education education;
    private String name;

    public Person(String name, Education education) {
        
        this.education = education;
        this.name = name;
    }

    @Override
    public String toString() {
        return name+", "+education;
        
    }
    
    public Education getEducation() {
        return education;
    }
    
    
    
    
    
}
