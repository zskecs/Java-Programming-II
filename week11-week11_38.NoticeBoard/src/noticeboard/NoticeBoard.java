package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {

        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {

        GridLayout grid = new GridLayout(3, 1);
        container.setLayout(grid);

        JButton button = new JButton("Copy!");

        JTextField textAreaTop = new JTextField("I was copied here from the JTextArea!");

        JLabel textAreaBottom = new JLabel();

        AreaCopier copier = new AreaCopier(textAreaTop, textAreaBottom);

        button.addActionListener(copier);
        container.add(textAreaTop);
        container.add(button);
        container.add(textAreaBottom);

    }
}
