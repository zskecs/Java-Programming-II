package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(100, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);

    }
    
    public void createComponents (Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        frame.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        
        ButtonGroup group = new ButtonGroup();
        group.add(yes);
        group.add(no);
        
        container.add(yes);
        container.add(no);
        
        
        container.add(new JLabel("Why?"));
        
        JRadioButton nreas = new JRadioButton("No reason.");
        JRadioButton jbec = new JRadioButton("Because it is fun!");
        
        group.add(nreas);
        group.add(jbec);
        
        container.add(nreas);
        container.add(jbec);
        
        JButton button = new JButton("Done!");
        container.add(button);
        
    }


    public JFrame getFrame() {
        return frame;
    }
}
