package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;
import reference.comparator.FilmComparator;
import java.util.*;

public class Main {

    public static void main(String[] args) {
      RatingRegister rek = new RatingRegister();
Film saksiKasi = new Film("Saksikäsi");
Film eraserhead = new Film("Eraserhead");
Film haifisch = new Film("Haifisch");
Person pekka = new Person("Pekka");
rek.addRating(pekka, eraserhead, Rating.GOOD);
rek.addRating(pekka, saksiKasi, Rating.FINE);
rek.addRating(eraserhead, Rating.GOOD);
rek.addRating(eraserhead, Rating.GOOD);
rek.addRating(eraserhead, Rating.GOOD);

rek.addRating(haifisch, Rating.BAD);
rek.addRating(haifisch, Rating.BAD);
Reference reference = new Reference(rek);
        System.out.println(reference.recommendFilm(new Person("Arto")));
        
        System.out.println(rek.filmRatings());
    }
}
