
package ru.mirea.lab1._4;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        int temp = 0;
        for (int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j ++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\t");
        for (int i = 0; i < 10; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
