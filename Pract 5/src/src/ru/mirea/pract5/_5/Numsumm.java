package src.ru.mirea.pract5._5;

import java.util.Scanner;

public class Numsumm {
    public static int nummsumm(int zifr, int sum) {
        if (zifr == 0)
        {
            return sum;
        }
        sum+=nummsumm(zifr/10, sum);
        return sum+=zifr%10;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите число");
        int zifr = in.nextInt();
        System.out.println ("Сумма цифр: ");
        System.out.println(nummsumm(zifr, 0));
    }
}
