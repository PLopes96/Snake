package main.Objects;

import javax.swing.*;
import java.awt.*;

public abstract class Object extends JPanel{

    private int x;
    private int y;

    public Object(int x, int y){

        this.x = x;
        this.y = y;

    }

    public void paint(Graphics g){

        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(this.x, this.y, 10, 10);

    }
}
