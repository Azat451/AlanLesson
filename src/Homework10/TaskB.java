package Homework10;

import java.util.Random;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер масива: ");
        int sizearray = sc.nextInt();
        int[] array = new int[sizearray];
        printMin(array);
        printMax(array);
    }
    static void printMin(int a[]){
        Random ran = new Random();
        System.out.print("\nМассив: ");
        System.out.println();
        for (int i = 0;i < a.length;i++){
            a[i] = ran.nextInt(30) + 1;
            System.out.print(a[i] + " ");

        }
        int min = a[0];
        for(int i = 0;i < a.length;i++){
            if (a[i] < min){
                min= a[i];
            }
        }
        System.out.print("\n------------------");
        System.out.println("\nМинимальный элемент: " + min);
    }
    static void printMax(int b[]){
        int max =b[0];
        for (int i = 0;i < b.length;i++){
        if (b[i] > max){
            max = b[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
    }
}
