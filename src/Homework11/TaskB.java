package Homework11;

import java.util.Random;
import java.util.Scanner;

public  class TaskB {
    public static void main(String[] args) {
        Array();
    }
    static int arrayCount(int[] array,int X){
        int count = 0;
        for (int i = 0;i < array.length;i++){
            if (array[i] == X){
                count++;
            }
        }
        return count;
    }
    static void Array(){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0;i < array.length;i++){
            array[i] = ran.nextInt(6);
            System.out.print(array[i] + " ");
        }
        System.out.print("\nВведите искомое число: ");
        int X = sc.nextInt();
        System.out.printf("Число - %d, было столько подчситано: %d\n",X,arrayCount(array,X));
    }
}


