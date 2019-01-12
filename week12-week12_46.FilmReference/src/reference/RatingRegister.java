/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.*;
import reference.domain.Film;
import reference.domain.Rating;
import reference.domain.Person;

/**
 *
 * @author zsolt
 */
public class RatingRegister {

    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, Map<Film, Rating>> list2;

    public RatingRegister() {

        filmRatings = new HashMap<Film, List<Rating>>();
        list2 = new HashMap<Person, Map<Film, Rating>>();

    }

    public void addRating(Film film, Rating rating) {
        if (filmRatings.get(film) == null) {
            filmRatings.put(film, new ArrayList<Rating>());
            filmRatings.get(film).add(rating);
        } else {

            filmRatings.get(film).add(rating);
        }
    }

    public List<Rating> getRatings(Film film) {

       

        return filmRatings.get(film);

    }

    public Map<Film, List<Rating>> filmRatings() {

        return filmRatings;

    }

    public void addRating(Person person, Film film, Rating rating) {
        if (list2.get(person) == null) {

            Map<Film, Rating> buffer = new HashMap<Film, Rating>();
            buffer.put(film, rating);

            list2.put(person, buffer);
            addRating(film, rating);

        } else {

            list2.get(person).put(film, rating);
              addRating(film, rating);
        }
    }

    public Rating getRating(Person person, Film film) {
        if (list2.get(person).get(film) == null) {

            return Rating.NOT_WATCHED;

        }

        return list2.get(person).get(film);

    }

    public Map<Film, Rating> getPersonalRatings(Person person) {

        if (list2.get(person) == null) {

            Map<Film, Rating> buffer = new HashMap<Film, Rating>();
            list2.put(person, buffer);
        }

        return list2.get(person);
    }

    public List<Person> reviewers() {
        List<Person> review = new ArrayList(list2.keySet());

        return review;
    }

}
