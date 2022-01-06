package Homework16.TaskA;

import java.util.Scanner;

public class Fish {
    private String name;
    private int age;
    private String abality;

    public Fish(String name, int age,String abality) {
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
        while (age <= 1 || age > 45){
            System.err.println("Вы ввели неправильный возраст рыбки");
            System.err.print("Пожалуйста введите правильный возраст: ");
            setAge(sc.nextInt());
        }
        return String.format("-----------\n" +
                "Имя Рыбки: %s \n" +
                " Возраст: %s \n" +
                "Спосбность: %s\n" +
                "-----------\n",name,age,abality);
    }
}
