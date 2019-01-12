package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.BorderLayout;

public class UserInterface implements Runnable {

    private JFrame frame;
    private PersonalCalculator calculator;
    
    public UserInterface(PersonalCalculator calc) {
        
        this.calculator = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout layout = new BorderLayout();
        container.setLayout(layout);

        JLabel text = new JLabel("0");
        JButton button = new JButton("Click!");

        

        ClickListener listener = new ClickListener(calculator, text);

        button.addActionListener(listener);
        
        container.add(text, BorderLayout.NORTH);
        container.add(button, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
