/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author zsolt
 */
public class MindfulDictionary {

    private Map<String, String> dictionary;
    private Scanner fileReader;
    private File f;

    public MindfulDictionary() {
        dictionary = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) throws IOException {
        dictionary = new HashMap<String, String>();

        f = new File(file);
        if (f.exists()) {
            fileReader = new Scanner(f);

        }
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {

            dictionary.put(word, translation);
        }
    }

    public String translate(String word) {
        String ret = "";

        if (dictionary.containsKey(word)) {
            return dictionary.get(word);

        } else {
            for (String key : dictionary.keySet()) {
                if (dictionary.get(key).equals(word)) {
                    ret = key;
                }
            }
        }

        if (ret.equals("")) {
            ret = null;
        }

        return ret;
    }

    public void remove(String word) {
        
            for(Map.Entry<String, String> map : dictionary.entrySet()) {
                if(map.getValue().equals(word) || map.getKey().equals(word)) {
                    dictionary.remove(map.getKey());
                    break;
                }
            }
        }
    


    public boolean load() {
        if (f.exists()) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // the line is split at :

                dictionary.put(parts[0], parts[1]);

            }

            return true;

        } else {
            return false;
        }
    }

    public boolean save() {

        try {
            FileWriter writer = new FileWriter(f);
            for (String key : dictionary.keySet()) {

                writer.write(key + ":" + dictionary.get(key) + "\n");

            }
            writer.close();

        } catch (IOException ioe) {
            return false;
        }

        return true;
    }

}
