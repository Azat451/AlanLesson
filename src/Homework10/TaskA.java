package Homework10;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите числа: ");
        int number = sc.nextInt();
        printNumber(number);
    }
    static void printNumber(int n){
        if (n < 10000 &&  n > 999){
        int num1 = n / 1000;
        int num2 = n / 100 %10;
        int num3 = n / 10 % 10;
        int num4 = n % 10;
            System.out.print(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4);
        }
        if (n < 1000 &&n > 99){
        int num1 = n / 100;
        int num2 = n / 10 % 10;
        int num3 = n % 10;
            System.out.println(num1 + "\n" + num2 + "\n" + num3);
        }
        if (n < 100 && n > 9){
        int num2 = n / 10 % 10;
        int num3 = n % 10;
            System.out.println(num2 + "\n" + num3);
        }
    }
}
