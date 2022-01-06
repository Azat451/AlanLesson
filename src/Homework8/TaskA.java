package Homework8;

import java.util.Random;

public class TaskA {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] array = new int[5];
        int min = 0,max = 10;
        int indexMin = 0,indexMax = 0;
        System.out.println("Массив: ");
        for (int i = 0;i < array.length;i++){
            array[i] = ran.nextInt(max - min + 1) + min;
            System.out.print(array[i] + " ");
        }
        int minarray = 1;
        int maxarray = 1;

        for (int i = 1;i < array.length;i++){
            if (array[i] < minarray){
                minarray = array[i];
                indexMin = i;
            }
            if (array[i] > maxarray){
                maxarray = array[i];
                indexMax = i;
            }

        }

        System.out.println();
        System.out.printf("Минимальное элемент A[%d] = %d\n",indexMin,minarray);
        System.out.printf("Максимальное элемент A[%d] =  %d\n",indexMax,maxarray);
    }
}
