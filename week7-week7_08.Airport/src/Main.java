

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Airplane airplane = new Airplane();

        Flight flight = new Flight(airplane);

        UserInterface ui = new UserInterface(reader, flight, airplane);
        ui.start();

    }
}
