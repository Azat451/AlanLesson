package Homework16.TaskA;

import java.util.Scanner;

public class Parrot {
    private String name;
    private int age;
    private String abality;

    public Parrot(String name, int age, String abality) {
        this.name = name;
        this.age = age;
        this.abality = abality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAbality() {
        return abality;
    }

    public void setAbality(String abality) {
        this.abality = abality;
    }

    @Override
    public String toString() {
        Scanner sc = new Scanner(System.in);
        while (age <= 1 || age > 35){
            System.err.println("Вы ввели неправильный возраст попугая");
            System.err.print("Пожалуйста введите правильный возраст: ");
            setAge(sc.nextInt());
        }
        return String.format("------------\n" +
                "Имя попугая: %s \n" +
                " Возраст: %s \n" +
                " Способность: %s\n" +
                "-----------\n",name,age,abality);
    }
}
