package src.ru.mirea.lab5._2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class Imageview extends JFrame {

    public Imageview(String path)
    {
        setContentPane(new JLabel(new ImageIcon(path)));
        setTitle("Background Color for JFrame");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
    }

    public static void main(String args[])
    {
      new Imageview(args[0]);
    }
}
