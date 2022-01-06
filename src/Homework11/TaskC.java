package Homework11;

import java.util.Random;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        arrayMatch();
        }
        static boolean cheack(int[] array){
            for (int i = 0;i < array.length - 1;i++){
                for (int j = i + 1;j < array.length;j++){
                    if (array[i] == array[j]){
                        return true;
                    }
                }
            }
            return false;
        }
        static void arrayMatch(){
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int N = sc.nextInt();
        int[] array = new int[N];
            System.out.println("Массив: \n-----------");
            for (int i = 0;i < array.length;i++){
                array[i] = ran.nextInt(5) + 1;
                System.out.print(array[i] + " ");
            }
            if (cheack(array)){
                System.out.printf("\nВ массиве есть одинаковые числа");
            }else {
                System.err.println("\nВ массиве нету одинаковых чисел");
            }
        }

    }

