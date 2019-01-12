
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
public class Storehouse {

    private Map<String, Integer> map;

    private Map<String, Integer> stock;

    public Storehouse() {
        map = new HashMap<String, Integer>();
        stock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {

        map.put(product, price);
        this.stock.put(product, stock);

    }

    public int price(String product) {

        if (map.containsKey(product)) {

            return map.get(product);

        }

        return -99;
    }

    public int stock(String product) {

        if (stock.containsKey(product)) {

            return stock.get(product);

        }

        return 0;
    }

    public boolean take(String product) {
        int buffer = 0;
        if (stock.containsKey(product)) {

            buffer = stock.get(product);
            if (buffer >= 1) {
                buffer--;

                stock.replace(product, buffer);
                
                return true;
            }
            

        }

        return false;

    }

    public Set<String> products() {
        Set<String> products = new HashSet<String>();

        for (String b : map.keySet()) {
            products.add(b);
        }
        return products;
    }
}
