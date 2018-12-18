package src.ru.mirea.lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Fileworker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Калякай предъяву:");
        String someMessage = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("Text.txt", false);
            fw.write(someMessage);
            fw.flush();
            System.out.println("\nЩа покумекаем\n...\n");
            FileReader fr = new FileReader("Text.txt");
            int c;
            System.out.println("Твоя предъява:");
            while ((c = fr.read()) != -1) {

                System.out.print((char) c);
            }

            System.out.println("\n\tЗа\tтобой\tвыехали\tщегол,\tзаряжай\tствол\t");
            System.out.println("*!ВАША ПОСЛЕДНЯЯ ВОЗМОЖНОСТЬ СКАЗАТЬ ЧТО-ТО В СВОЁ ОПРАВДАНИЕ!*");
            System.out.println("Стой, чувак, остынь, ты неправильно меня понял, я...");
            fw.close();
            fw = new FileWriter("Text.txt", false);
            someMessage = sc.nextLine();
            fw.write(someMessage);
            fw.flush();
            System.out.println("Соскочить решил?????????! Нет уж, МОЛИСЬ, чтобы всё кончилось БЫСТРО\n*приставляет пистолет к вашей голове*\n");
            System.out.println("ПОСЛЕДНЕЕ ЖЕЛАНИЕ!");
            fw = new FileWriter("Text.txt", true);
            someMessage = sc.nextLine();
            fw.write("\n");
            fw.write(someMessage);
            fw.flush();
            System.out.println("*глухой выстрел*");
            System.out.println("*Вы умерли*");
            System.out.println("Поностальгировать о вашей земной жизни можно в текстовом файле");
        } catch (IOException ex) {
            System.out.println("Моя предъява:");
            System.out.println(ex.getMessage());
        }

    }
}

