package ru.mirea.lab1;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int len = sc.nextInt();
        int [] arr = new int [len];
        for (int i=0; i<len; i++)
        {
            System.out.println("Введите " + (i+1) +"е число");
            arr[i]=sc.nextInt();
        }
        int summa=0;
        System.out.println("Сумма чисел массива с for:");
        for (int i=0; i<len; i++)
        {
            summa = sum (summa, arr[i]);
        }
        System.out.println(summa);
        summa=0;
        System.out.println("Сумма чисел массива с while:");
        int i=0; while (i<len)
        {
            summa = sum (summa, arr[i]); i++;
        }
        System.out.println(summa);
        summa =0;
        System.out.println("Сумма чисел массива с do-while:");
        i=0;
        do
        {
            summa = sum (summa, arr[i]); i++;
        }
        while (i<len);
        System.out.println(summa);
    }
    public static int sum(int a, int b)
    {
        return a+b;
    }
}
