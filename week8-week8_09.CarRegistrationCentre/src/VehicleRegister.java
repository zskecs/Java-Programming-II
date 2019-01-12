
import java.util.HashMap;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zsolt
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {

        owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!this.owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {

        if (this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate key : this.owners.keySet()) {
            System.out.println(key);
        }

    }

    public void printOwners() {

        ArrayList<String> list = new ArrayList<String>();
        String buffer = "";
        for (RegistrationPlate key : this.owners.keySet()) {
            if (!buffer.equals(this.owners.get(key))) {
                list.add(this.owners.get(key));
                buffer = this.owners.get(key);
            }
        }
        
        for (String b : list) {
            System.out.println(b);
        }
    }
}
