/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zsolt
 */
public class CivilService implements NationalService {

    private int daysLeft;

    public CivilService() {

        this.daysLeft = 362;

    }

    public void work() {
        if (this.daysLeft >= 1) {
            this.daysLeft -= 1;
        }

    }

    public int getDaysLeft() {
        return this.daysLeft;
    }

}
