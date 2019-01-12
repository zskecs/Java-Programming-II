
import java.util.ArrayList;
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
public class UserInterface {

    private Scanner reader;
    private Flight flight;
    private Airplane airplane;

    public UserInterface(Scanner reader, Flight flight, Airplane airplane) {
        this.reader = reader;
        this.flight = flight;
        this.airplane = airplane;
    }

    public void start() {

        System.out.println("Airport panel\n"
                + "--------------------");
        System.out.println("");
        statements1();
        while (true) {

            String input = reader.nextLine().trim();

            if (input.equalsIgnoreCase("1")) {
                addPlane();

                statements1();

            } else if (input.equalsIgnoreCase("2")) {

                addFlight();

                statements1();

            } else if (input.equalsIgnoreCase("x")) {
                System.out.println("");
                break;

            }
        }

        System.out.println("Flight service\n"
                + "------------");
        System.out.println("");
        statements2();
        
        while (true) {

            String input = reader.nextLine().trim();

            if (input.equalsIgnoreCase("1")) {

                ArrayList<String> printplanes = airplane.printPlanes();
                for (String planes : printplanes) {
                    System.out.println(planes);

                }
               statements2();

            } else if (input.equalsIgnoreCase("2")) {

                ArrayList<String> flights = flight.flights();
                for (String d : flights) {
                    System.out.println(d);

                }
                statements2();

            } else if (input.equalsIgnoreCase("x")) {
                
                break;

            } else if (input.equalsIgnoreCase("3")) {

                ArrayList<String> printplanes = airplane.printPlanes();
                CharSequence cs1 = addKey();
                for (String plane : printplanes) {
                    if (plane.contains(cs1))  {
                        System.out.println(plane);
                    }

                }
                System.out.println("");
                statements2();
            }
        }
    }

    public void statements1() {
        System.out.print("Choose operation:\n"
                + "[1] Add airplane\n"
                + "[2] Add flight\n"
                + "[x] Exit\n"
                + "> ");
    }

    public void statements2() {
        System.out.print("Choose operation:\n"
                + "[1] Print planes\n"
                + "[2] Print flights\n"
                + "[3] Print plane info\n"
                + "[x] Quit\n"
                + "> ");
    }

    public void addPlane() {

        System.out.print("Give plane ID: ");
        String a = reader.nextLine();
        System.out.print("Give plane capacity: ");
        Integer b = Integer.parseInt(reader.nextLine());

        airplane.add(a, b);

    }

    public void addFlight() {

        System.out.print("Give plane ID: ");
        String a = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String b = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String c = reader.nextLine();
        flight.add(a, b + "-" + c);

    }

    public String addKey() {
        System.out.print("Give plane ID: ");
        String a = reader.nextLine();

        return a;
    }

}
