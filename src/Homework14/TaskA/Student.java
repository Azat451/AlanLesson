package Homework14.TaskA;

import java.util.Scanner;

public class Student {
    String name;
    String sureName;
    int age;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Введите имя и фамилию студента - "); // Одна строка
        student.name = sc.next();
        student.sureName = sc.next();
        System.out.println("Введите возраст студента");
        student.age = sc.nextInt();
        while (student.age < 18 || student.age > 18){
            System.err.println("Прошу пожалуйста введите правильный возраст студента");
            student.age = sc.nextInt();
            if (student.age == 18){
                System.out.println(student.name+"\n"+student.sureName+"\n"+student.age);
            }
        }
    }
}
