package src.ru.mirea.lab6._1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;
import java.lang.String;

public class ButtonEventListener implements ActionListener {
    public static int i = 0;
    private int res = 0;
    private JTextField input = new JTextField();

    public ButtonEventListener(int res, JTextField text){
        this.res = res;
        this.input = text;
    }

    @Override
    public void actionPerformed (ActionEvent e){
        i++;
        int in = stringToInt(this.input.getText(), 10);
        String msg;
        if (i <= 3) {
            msg = String.valueOf(i) + " попытка: " + "\n";
            if (in < res) {
                msg += "Число меньше заданного";
                JOptionPane.showMessageDialog(null, msg, "Результат", JOptionPane.PLAIN_MESSAGE);
            } else if (in > res) {
                msg += "Число больше заданного";
                JOptionPane.showMessageDialog(null, msg, "Результат", JOptionPane.PLAIN_MESSAGE);
            } else {
                msg += "ПОБЕДА";
                JOptionPane.showMessageDialog(null, msg, "Результат", JOptionPane.PLAIN_MESSAGE);
                System.exit(1);
            }

        } else {
            msg = "Вы проиграли (использовали больше 3-х попыток)";
            JOptionPane.showMessageDialog(null, msg, "Результат", JOptionPane.PLAIN_MESSAGE);
            System.exit(1);

        }
    }

    public int stringToInt(String val, int defaultVal) {
        try {
            return Integer.parseInt(val);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }
}

