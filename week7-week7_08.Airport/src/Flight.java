
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zsolt
 */
public class Flight {

    ArrayList<String> flights;

    private Airplane airplane;

    public Flight(Airplane airplane) {
        flights = new ArrayList<String>();
        this.airplane = airplane;
    }

    public void add(String airplane, String route) {
        flights.add(airplane + " (" + this.airplane.capacity(airplane) + " ppl) " + "(" + route + ")");
    }

    public ArrayList<String> flights() {

        return flights;

    }

}
