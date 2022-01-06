package Homework7;

import java.util.Random;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int count1 = 0,count2 = 0,count3 = 0;
        int sum1 = 0,sum2 = 0,sum3 = 0;
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int min = 1,max = 100;
        int[] array = new int[size];
        System.out.println("Ваш массив");
        for (int i = 0;i < array.length;i++){
            array[i] = ran.nextInt(max - min + 1) + min;
            System.out.print(array[i] + " ");
        }
        for (int i = 0;i < array.length;i++){
            if (array[i] < 31){
            count1++;
            sum1 = sum1 +array[i];
            }
            if (array[i] > 30 && array[i] < 61){
            count2++;
            sum2 = sum2 + array[i];
            }
            if (array[i] > 60 && array[i] <= 100){
            count3++;
            sum3 = sum3 + array[i];
            }
        }
        System.out.println();
        System.out.println("От 1 до 30 = " + (float) sum1 / count1 + "  Количество: " + count1);
        System.out.println("От 31 до 60 = " + (float) sum2 / count2 + "  Количество: " + count2);
        System.out.println("От 61 до 100 = " + (float) sum3 / count3 + "  Количество: " + count3);
    }
}
