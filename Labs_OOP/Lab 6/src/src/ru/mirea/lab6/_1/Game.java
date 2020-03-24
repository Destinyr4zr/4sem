package src.ru.mirea.lab6._1;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    private JButton button = new JButton("Ввод");
    private JTextField input = new JTextField("");
    private JLabel label = new JLabel("Введите число от 0 до 20: ");
    private int mystery = (int)(Math.random() * 20);

    public Game() {
        super("Игра на вашу душу");
        this.setBounds(300,300,300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1));
        container.add(label);
        container.add(input);

        button.addActionListener(new ButtonEventListener (mystery, input));
        container.add(button);
    }
}
