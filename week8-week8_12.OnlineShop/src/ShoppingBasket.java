
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
public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {

        if (basket.containsKey(product)) {
            basket.get(product).increaseAmount();

        } else {
            Purchase purchase = new Purchase(product, 1, price);
            basket.put(product, purchase);
        }
    }

    public int price() {
        int sum = 0;
        for (Purchase value : basket.values()) {

            sum += value.price();

        }
        return sum;

    }

    public void print() {
        for (Purchase value : basket.values()) {
            System.out.println(value);
        }
    }
}
