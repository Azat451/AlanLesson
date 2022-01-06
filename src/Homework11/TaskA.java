package Homework11;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        even();
    }
    /**
    static boolean evenNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.printf("Число - %d является четным \n",N);
            return true;
        }else {
            System.out.printf("Число - %d не является четным \n",N);
        }return false;
    }
//     первый вариант
     */
    static boolean isEvenNumber(int num){
        return num % 2 == 0;
    }
    static void even(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое четнное число: ");
        int num = sc.nextInt();
        if (isEvenNumber(num)){
            System.out.printf("Число - %d является четным числом \n",num);
        }else {
            System.err.printf("Число - %d не является четным числом\n",num);
        }
    }
}
