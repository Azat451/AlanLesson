package Homework16.TaskB.newtest;

import Homework16.TaskB.Course;
import Homework16.TaskB.Group;
import Homework16.TaskB.Student;

public class newTest {
    public static void main(String[] args) {
        Course course = new Course("Програмирования","14.9.18","id174578","Азамат Щульц Петрович");
        Student[] students = new Student[2];
        students[0] = new Student(2000,"Mason","Alex","male",78);
        students[1] = new Student(2001,"Nikolos","Victor","male",12);
        Group group = new Group("20.9.17","12",students,course);
        System.out.println(group);
    }
}
