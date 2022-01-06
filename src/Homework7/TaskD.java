package Homework7;

import java.util.Random;

public class TaskD {
    public static void main(String[] args) {
        Random ran = new Random();
        int min = 0,max = 100;
        int[] array = new int[5];
        System.out.println("Ваш массив");
        for (int i = 0;i < array.length;i++){
            array[i] = ran.nextInt(max - min + 1) + min;
            System.out.print(array[i] + " ");
        }
        int count1 = 0,count2 = 0;
        int sum1 = 0,sum2 = 0;
        for (int i = 0;i < array.length;i++){
            if (array[i] < 50 ){
                count1++;
                sum1 += array[i];
            }
            if (array[i] > 50){
                count2++;
                sum2 += array[i];
            }
        }
        System.out.println();
        System.out.println("Среднее арефметическое элементов [0,50]: " + (float) sum1/count1);
        System.out.println("Среднее арефметическое элементов [50,100]: " + (float) sum2/count2);
    }
}
