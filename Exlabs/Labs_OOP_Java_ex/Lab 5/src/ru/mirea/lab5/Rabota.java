package ru.mirea.lab5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Rabota extends JFrame
{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button1 = new JButton(" + ");
    JButton button2 = new JButton(" - ");
    JButton button3 = new JButton(" X ");
    JButton button4 = new JButton(" / ");
    JButton button5 = new JButton(" ^ ");
    JButton button6 = new JButton(" SQR ");
    Font font = new Font("Times new roman",Font.BOLD,100);
    boolean text1nonblank = false;
    boolean text2nonblank = false;
    Rabota() {
        super("Калькулятор");
        setLayout(new FlowLayout());
        setSize(400, 200);
        add(new JLabel("Число А"));
        add(jta1);
        add(new JLabel("Число В"));
        add(jta2);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 =
                            Double.parseDouble(jta1.getText().trim());
                    double x2 =
                            Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "
                                    +(x1+x2), "Внимание!",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ошибка в числе!\nПопробуйте еще раз!", "Внимание!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 =
                            Double.parseDouble(jta1.getText().trim());
                    double x2 =
                            Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "
                                    +(x1-x2), "Внимание!",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ошибка в числе!\nПопробуйте еще раз!", "Внимание!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 =
                            Double.parseDouble(jta1.getText().trim());
                    double x2 =
                            Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "
                                    +(x1*x2), "Внимание!",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ошибка в числе!\nПопробуйте еще раз!", "Внимание!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 =
                            Double.parseDouble(jta1.getText().trim());
                    double x2 =
                            Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "
                                    +(x1/x2), "Внимание!",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ошибка в числе!\nПопробуйте еще раз!", "Внимание!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 =
                            Double.parseDouble(jta1.getText().trim());
                    double x2 =
                            Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "
                                    +Math.pow(x1,x2), "Внимание!",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ошибка в числе!\nПопробуйте еще раз!", "Внимание!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jta1.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                changed();
            }
            public void removeUpdate(DocumentEvent e) {
                changed();
            }
            public void insertUpdate(DocumentEvent e) {
                changed();
            }

            public void changed() {
                if (jta1.getText().trim().isEmpty() == jta2.getText().trim().isEmpty()){
                    button6.setEnabled(false);
                    text1nonblank = false;
                    text2nonblank = false;
                }
                else if (jta1.getText().trim().isEmpty()){
                    button6.setEnabled(true);
                    text1nonblank = false;
                    text2nonblank = true;
                }
                else
                {
                    button6.setEnabled(true);
                    text1nonblank = true;
                    text2nonblank = false;
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    if (text1nonblank)
                    {
                        double x1 = Double.parseDouble(jta1.getText().trim());
                        JOptionPane.showMessageDialog(null, "Результат = " +Math.sqrt(x1), "Внимание!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (text2nonblank)
                    {
                        double x2 = Double.parseDouble(jta2.getText().trim());
                        JOptionPane.showMessageDialog(null, "Результат = " +Math.sqrt(x2), "Внимание!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ошибка в числе!\nПопробуйте еще раз!", "Внимание!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }
}



