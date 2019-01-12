/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Map;
import java.util.Comparator;
import reference.domain.Film;
import java.util.List;
import reference.domain.Rating;

/**
 *
 * @author zsolt
 */
public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    public int compare(Film t, Film t1) {

        double average1 = calculateAverage(ratings.get(t));
        double average2 = calculateAverage(ratings.get(t1));

        if (average1 < average2) {
            return 1;
        } else if (average1 > average2) {
            return -1;
        } else {
            return 0;
        }

    }

    private double calculateAverage(List<Rating> ratings) {
        if (ratings == null || ratings.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Rating b : ratings) {
            sum += b.getValue();
        }

        return sum / ratings.size();
    }

}
