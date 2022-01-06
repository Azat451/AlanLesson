package Homework9;

import java.util.Random;

public class TaskA {
    public static void main(String[] args) {
        Random ran = new Random();
        int min = 10,max = 99;
        int[][] matrix = new int [5][5];
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                matrix[i][j] = ran.nextInt(max + 1 - min) + min;
                System.out.printf("%s ",matrix[i][j]);
            }
        System.out.println();
    }
    int minvalue = matrix[0][0];
    int minvaluei = 0;
    int minvaluej = 0;
    int maxvalue = matrix[0][0];
    int maxvaluei = 0;
    int maxvaluej = 0;
        for (int i = 0;i < matrix.length;i++){
        for (int j = 0;j < matrix[i].length;j++){
            if (matrix[i][j] < minvalue ){
                minvalue = matrix[i][j];
                minvaluei = i;
                minvaluej = j;
            }
            if (matrix[i][j] > maxvalue){
                maxvalue = matrix[i][j];
                maxvaluei = i;
                maxvaluej = j;
            }
        }
    }
        System.out.printf("Минимальное значения A[%s][%s] = %s\n",minvaluei,minvaluej,minvalue);
        System.out.printf("Максимальное значения A[%s][%s] = %s\n",maxvaluei,maxvaluej,maxvalue);
    }
}
