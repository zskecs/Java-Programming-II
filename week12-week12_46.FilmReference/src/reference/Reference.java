/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import reference.domain.Film;
import reference.comparator.FilmComparator;
import reference.domain.Person;
import java.util.*;
import reference.domain.Rating;

/**
 *
 * @author zsolt
 */
public class Reference {

    private RatingRegister register;

    private List<Film> films;

    private Map<Film, List<Rating>> filmRatings;

    public Reference(RatingRegister register) {

        this.register = register;
        filmRatings = register.filmRatings();
        films = new ArrayList<Film>(filmRatings.keySet());
        
    }

    public Film recommendFilm(Person person) {
        
        FilmComparator comp = new FilmComparator(filmRatings);

        Collections.sort(films, comp);
        
        

        return films.get(0);
    }

}
