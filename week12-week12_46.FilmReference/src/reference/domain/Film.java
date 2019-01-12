/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author zsolt
 */
public class Film {

    private String film;

    public Film(String name) {

        this.film = name;
    }

    public String getName() {

        return film;

    }

    @Override
    public String toString() {
        return film;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (this.film != null ? this.film.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        if ((this.film == null) ? (other.film != null) : !this.film.equals(other.film)) {
            return false;
        }
        return true;
    }

    
    
    
}
