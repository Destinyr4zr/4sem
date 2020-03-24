package ru.mirea.lab2._1;

import java.lang.*;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        double r;
        Circle с1 = new Circle(3.1, 4.1, 5.1, "red");
        System.out.println("Длина окружности = " + с1.getLength() + " см");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус ");
        r = source.nextDouble();
        с1.setR(r);
        System.out.println("\nДлина окружности = " + с1.getLength() + " см");
        Circle c2 = new Circle();
        System.out.println("\nОкружность по умолчанию: "+c2.toString());
    }
}

