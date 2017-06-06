package main.Menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame{

    private JButton start = new JButton("Start");
    private JButton exit = new JButton("Exit");
    private JFrame currentWindow = new JFrame();

    public MainMenu(){

        super("Main Menu");
        currentWindow.setLayout(new FlowLayout());
        currentWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        currentWindow.setPreferredSize(new Dimension(400,400));
        currentWindow.pack();
        currentWindow.setResizable(true);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameWindow gameWindow = new GameWindow();
                currentWindow.dispose();
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        currentWindow.add(start);
        currentWindow.add(exit);

        currentWindow.setVisible(true);
    }


}
