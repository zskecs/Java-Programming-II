
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
public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<String, String>();
  
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }

        return null;
    }

    public void add(String word, String translation) {

        this.dictionary.put(word, translation);

    }
    
    public int amountOfWords() {
        int size = dictionary.size();
        
        return size;
            
        }
    
   public ArrayList<String> translationList() {
        
         ArrayList<String> translationlist = new  ArrayList<String>();
         
         for ( String key : dictionary.keySet() ) {
        String value = dictionary.get(key);
        
        translationlist.add(key+" = "+value);
    }
         
         
         return translationlist;
         
    }
    }


