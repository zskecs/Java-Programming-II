
public class Main {

    public static void main(String[] args) {
        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 1);

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));

        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take sugar " + store.take("sugar"));

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));
        
    
        
          ShoppingBasket basket = new ShoppingBasket();
       
        
        
basket.add("milk",3); 
basket.add("butter",5);
basket.add("bread",4); 
basket.print();
            
    }

    
}

