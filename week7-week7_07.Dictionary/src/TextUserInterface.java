
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zsolt
 */
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {

        System.out.println("Statement:\n"
                + "  quit - quit the text user interface");
        while (true) {
            System.out.println("Statement:");

            String input = reader.nextLine().trim();

            if (input.equals("add")) {
                add();

            } else if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("translate")) {

                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add() {

        System.out.print("In Finnish: ");
        String a = reader.nextLine();
        System.out.print("Translation: ");
        String b = reader.nextLine();

        dictionary.add(a, b);
    }

    public void translate() {

        System.out.print("Give a word: ");
        String a = reader.nextLine();
        System.out.print("Translation: ");
        String translation = dictionary.translate(a);
        System.out.println("Translation: " + translation);

    }
}
