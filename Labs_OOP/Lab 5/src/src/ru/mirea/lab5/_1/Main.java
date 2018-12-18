package src.ru.mirea.lab5._1;

import java.awt.*;
import javax.swing.*;
import java.lang.String;
public class Main extends JFrame {
    int width = 800; int height = 800, polywidth = 500, polyheight = 500, polydetail = 7;
    Shape[] shapes = new Shape[20];

    Main() {
        super("Фигуры");
        setBackground(Color.WHITE);
        setLayout(null);
        setSize(width, height);
        createShapes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void createShapes() {
        for(int i = 0; i < 20; i++) {
            int rand = (int) (Math.random() * 2.6);
            switch(rand) {
                case 0: shapes[i] = new Ellipse();
                    shapes[i] = createOvalPos(shapes[i]); break;
                case 1: shapes[i] = new Rectangle();
                    shapes[i] = createRectPos(shapes[i]); break;
                case 2: shapes[i] = new Polygon();
                    shapes[i] = createPolyPos(shapes[i]); break;
                default: break;
            }
            shapes[i].setColor();
            add(shapes[i]);
            shapes[i].setBounds(0, 0,width , height);
        }
    }

    public Ellipse createOvalPos(Shape shape) {
        Ellipse ellipse = (Ellipse) shape;
        int x = (int) (Math.random() * 1000);
        int y = (int) (Math.random() * 1000);
        int length = (int) (Math.random() * 300);
        int height = (int) (Math.random() * 300);
        ellipse.setPosition(x, y, length, height);
        return ellipse;
    }

    public Rectangle createRectPos(Shape shape) {
        Rectangle rectangle = (Rectangle) shape;
        int x = (int) (Math.random() * 800);
        int y = (int) (Math.random() * 800);
        int length = (int) (Math.random() * 200);
        int height = (int) (Math.random() * 200);
        rectangle.setPosition(x, y, length, height);
        return rectangle;
    }

    public Polygon createPolyPos(Shape shape) {
        Polygon polygon = (Polygon) shape;
        int[] x = new int[polydetail];
        int[] y = new int[polydetail];
        for(int i = 0; i < polydetail; i++) {
            x[i] = (int) (Math.random() * polywidth);
            y[i] = (int) (Math.random() * polyheight);
        }
        polygon.setPosition(x, y);
        return polygon;
    }

    public static void main(String[] args) {
        new Main();
    }
}
