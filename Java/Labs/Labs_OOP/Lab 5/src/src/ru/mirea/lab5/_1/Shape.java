package src.ru.mirea.lab5._1;

import java.awt.Color;
import javax.swing.JPanel;
public abstract class Shape extends JPanel{
    Color color;

    public Shape() {}
    public Shape(int r, int g, int b) {
        color = new Color(r, g, b);
    }

    public void setColor() {
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        color = new Color(r, g, b);
    }
}
