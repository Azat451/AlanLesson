package Homework9;

import java.util.Random;

public class TaskB {
    public static void main(String[] args) {
        Random ran = new Random();
        int sum = 0,count = 0;
        int[][] matrix = new int[4][4];
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                matrix[i][j] = ran.nextInt(256);
                System.out.print(matrix[i][j] + "        ");
            }
            System.out.println();
        }
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                sum += matrix[i][j];
                count++;
            }
        }
        System.out.println("\nСреднее яркость: " + (float) sum/count);
        System.out.println("Результат: ");
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                if (matrix[i][j] < sum/count){
                    matrix[i][j] = 0;
                }else {
                    matrix[i][j] = 255;
                }
                System.out.print(matrix[i][j] + "        ");
            }
            System.out.println();
        }
    }
}
