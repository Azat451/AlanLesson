package Homework8;

import java.util.Scanner;

public class Taskdouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int N = sc.nextInt();
        for (int i = 1;i <= N;i++){
            int start = i;
            int finish = i;
            if (i % 10 == 0){
            continue;
            }
            while(finish != 0){
                if (finish % 10 == 0){
                continue;
                }
                if ((start % (finish % 10))== 0)finish = finish / 10;
                else
                    break;
            }
            if (finish == 0){
                System.out.print(start + " ");
            }
        }
    }
}
