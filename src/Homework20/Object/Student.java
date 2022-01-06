package Homework20.Object;

import java.util.Scanner;

public class Student {
    private int DateOfBirth;
    private String Surname;
    private String name;
    private boolean gender;
    private int age;

    public Student(int DateOfBirth, String surname, String name, boolean gender, int age) {
        this.DateOfBirth = DateOfBirth;
        this.Surname = surname;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getDateofBirth() {
        return DateOfBirth;
    }

    public void setDateofBirth(int dateofBirth) {
        DateOfBirth = dateofBirth;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        Scanner sc = new Scanner(System.in);
        while (age <= 15 || age > 51) {
            System.err.println("Вы ввели нерпавильный возраст,возраст студента должен быть с 18 до 20");
            System.err.print("Введите правильный возраст " + name + "- ");
            setAge(sc.nextInt());
        }
        return String.format("\nДата рождения: %s\n" +
                "Фамилия Студента : %s\n" +
                "Имя: %s\n" +
                "Пол студента: %s\n" +
                "Возраст: %s\n" +
                "-------------", DateOfBirth, Surname, name, gender ? "Женш." : "Муж.", getAge());
    }
}
  