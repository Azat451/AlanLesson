package Homework10;

import java.util.Random;

public class TaskC {
    public static void main(String[] args) {
        int[] array = new  int[6];
        printArray(array);

    }
    static void printArray(int[] array){
        Random ran = new Random();
        System.out.println("Массив: ");
        for (int i = 0;i < array.length;i++){
            array[i] = ran.nextInt(36) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println("\nУвеличение на 1 число: ");
        for(int i = 0;i < array.length;i++){
        array[i] = array[i] + 1;
            System.out.print(array[i] + " ");
        }
    }
}
