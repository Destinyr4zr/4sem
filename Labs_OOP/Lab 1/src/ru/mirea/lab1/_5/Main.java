package ru.mirea.lab1._5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение факториала: ");
        int factval = sc.nextInt(), resval = 1;
        for (int i = 1; i < factval + 1; i++) {
            resval *= i;
        }
        System.out.println(resval);
    }
}
