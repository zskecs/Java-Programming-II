import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
           Scanner reader = new Scanner(System.in);
   

        UserInterface ui = new UserInterface(reader);
        ui.start();

    }
}
