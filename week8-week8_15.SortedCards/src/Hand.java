
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zsolt
 */
public class Hand implements Comparable<Hand> {

    private List<Card> list = new ArrayList<Card>();

    public void add(Card card) {
        list.add(card);
    }

    public void print() {
        for (Card a : list) {
            System.out.println(a);
        }
    }

    public void sort() {
        Collections.sort(list);
    }

    public int compareTo(Hand other) {
        int sum1 = 0;
        int sum2 = 0;

        for (Card a : this.list) {
            sum1 += a.getValue();
        }

        for (Card a : other.list) {
            sum2 += a.getValue();
        }

        if (sum1 < sum2) {

            return -1;

        } else if (sum1 == sum2) {

            return 0;

        } else {
            return 1;
        }

    }
    
    public void sortAgainstSuit() {
        Collections.sort(list, new SortAgainstSuitAndValue());
    }
}
