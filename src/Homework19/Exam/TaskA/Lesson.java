package Homework19.Exam.TaskA;

import java.util.Arrays;
import java.util.Random;

public class Lesson extends Group{
    private Student[] arrnt = new Student[0];
    private String firstTime;
    private boolean homeWork;
    private boolean exam;


    public Lesson(String beginnig, String duration,String firstTime,
                  Course courses,boolean homeWork,boolean exam,Student[] students) {
        super(beginnig, duration, students, courses);
        Random ran = new Random();
        while (true){
            if (arrnt.length == students.length){
                break;
            }
            arrnt = Arrays.copyOf(arrnt,arrnt.length + 1);
            arrnt[arrnt.length - 1] = students[ran.nextInt(students.length - 1 + 1)];
            if (((ran.nextInt(100 - 1 + 1) + 1) % 3) == 0){
                break;
            }
        }
        this.homeWork = homeWork;
        this.exam = exam;
        this.firstTime = firstTime;
    }

    public Student[] getArrnt() {
        String arr = "";
        for (Student at : arrnt){
            arr = arr + "" + at;
        }
        return arrnt;
    }

    public void setArrnt(Student[] arrnt) {
        this.arrnt = arrnt;
    }

    public String getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(String firstTime) {
        this.firstTime = firstTime;
    }

    public boolean getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(boolean homeWork) {
        this.homeWork = homeWork;
    }


    public boolean getExam() {
        return exam;
    }

    public void setExam(boolean exam) {
        this.exam = exam;
    }

    @Override
    public String toString(){
        return String.format("Дата проведение - %s\n" +
                "Курс: %s  \n Время начала - %s\n" +
                "Было Домашние задание? -  %s \n" +
                "Был Экзамен? -  %s" +
                "\n___________" +
                "\nПрисутсвующие студенты - %s\n", super.getBeginnig(),super.getCourses(),firstTime,
                homeWork ? "Да!Было дом. задание" : "Нет!Не было",
                exam ? "Да!Был екзамен" : "Нет!Не был",Arrays.toString(getArrnt()));
    }
}
