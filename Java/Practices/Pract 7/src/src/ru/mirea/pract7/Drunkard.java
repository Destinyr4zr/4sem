package src.ru.mirea.pract7;

import java.util.Scanner;

public class Drunkard {
    private static int stepcontrol = 0;
    public static int play(Cardpack first, Cardpack second) {

       if(first.checkTop() < second.checkTop() || first.checkTop() == 9 & second.checkTop() == 0) {
            second.addBottom(second.removeTop());
            second.addBottom(first.removeTop());
            stepcontrol++;
        } else if(first.checkTop() == second.checkTop()) {
            first.addBottom(first.removeTop());
            second.addBottom(second.removeTop());
            stepcontrol++;
        } else if(first.checkTop() > second.checkTop() || first.checkTop() == 0 & second.checkTop() == 9) {
            first.addBottom(first.removeTop());
            first.addBottom(second.removeTop());
            stepcontrol++;
        }
        return stepcontrol;
    }

    public static boolean whoIsWin(Cardpack first, Cardpack second, int k) {
        if(stepcontrol == 106) {
            System.out.println("Botva " + k);
            return false;
        }
        else if(first.isEmpty()) {
            System.out.println("Second " + k);
            return false;
        }
        else if (second.isEmpty()) {
            System.out.println("First " + k);
            return false;
        }
            return true;
    }

    public static void main(String[] args) {
        Cardpack first = new Cardpack();
        Cardpack second = new Cardpack();
        int k=0;
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("///Вводите карты через пробел");
        System.out.println("Введите 5 карт первого игрока");
        for (String number :scan.nextLine().split(" "))
        {
            arr1[k] = Integer.parseInt(number);
            k++;
        }
        k=0;
        System.out.println("Введите 5 карт второго игрока");
        for (String number :scan.nextLine().split(" "))
        {
            arr2[k] = Integer.parseInt(number);
            k++;
        }
        k=0;
        first.start(arr1);
        second.start(arr2);
        first.show(k);
        second.show(k);
        while(whoIsWin(first, second, k)) {
            k = play(first, second);
            first.show(k);
            second.show(k);
        }
    }
}
