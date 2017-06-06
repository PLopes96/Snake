package main.Menus;

import main.Objects.Player;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame{

    private JFrame currentWindow = new JFrame();
    private Player player = new Player();

    public GameWindow(){

        super("Snake");
        currentWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        currentWindow.setPreferredSize(new Dimension(400,400));
        currentWindow.pack();
        currentWindow.setResizable(false);

        currentWindow.add(player);

        currentWindow.setVisible(true);

    }

}
