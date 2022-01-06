package Homework7;

import java.util.Random;

public class TaskA {
    public static void main(String[] args) {
        Random ran = new Random();
        int min = 0,max = 5;
        int[] array = new int[5];
        int count = 0;
        System.out.println("Ваш массив: ");
        for (int i = 0;i < array.length;i++){
            array[i] = ran.nextInt(max - min + 1) + min;
            System.out.print(array[i] + " ");

    }
        for (int i = 0;i < array.length;i++){
        if (count != array[i]){
            System.out.println();
            System.out.printf("Есть: " +  array[i]);
            break;
        }else {
            System.out.println("Нету");
        }
            count++;
        }
}
}
