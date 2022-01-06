package Homework18.TaskA;

import java.util.Scanner;

public class Sheep {
    private double weight;
    private int age;
    private boolean gender;
    private String name;

    public Sheep(double weight, int age,boolean gender, String name) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
            this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        Scanner sc = new Scanner(System.in);
        while (age <= 1 || age > 12){
            System.err.println("Имя овечки - " + name);
            System.err.println("Вы ввели не правильный возраст!Овца должна быть возрастом с 1 года до 12");
            System.err.print("Введите правильный возраст - ");
            setAge(sc.nextInt());
        }

        return String.format("\n----------\n" +
                "Вес: %s\n" +
                "Возраст: %s\n" +
                "Пол овцы: %s\n" +
                "Кличка овцы: %s\n" +
                "----------\n",weight,age,gender == true ? "female" : "male",name);
    }
}
