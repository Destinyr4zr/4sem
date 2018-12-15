package src.ru.mirea.pract5._3;

import java.util.Scanner;

public class Scale {
    public static void scaling(int A, int B) {
        if (A==B)
            System.out.print(" "+A+" ");
        else if (A < B) {
            System.out.print(" "+A+" ");
            scaling(A+1 , B);
        } else {
            System.out.print(" "+B+" ");
            scaling(A, B+1 );
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите число А");
        int first = in.nextInt();
        System.out.println ("Введите число B");
        int second = in.nextInt();
        scaling(first,second);
    }
}
