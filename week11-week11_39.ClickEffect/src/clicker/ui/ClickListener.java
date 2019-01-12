/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import clicker.applicationlogic.Calculator;
import javax.swing.*;

/**
 *
 * @author zsolt
 */
public class ClickListener implements ActionListener {

    private Calculator calculator;
    private JLabel label;

    public ClickListener(Calculator calc, JLabel label) {

        this.calculator = calc;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        calculator.increase();
        label.setText(""+calculator.giveValue());

    }

}
