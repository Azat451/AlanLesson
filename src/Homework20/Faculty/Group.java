package Homework20.Faculty;



import Homework20.Object.Student;

import java.util.Arrays;

public class Group {
    private String beginnig;
    private String Duration;
    private Student[] students;
    private Course courses;

    public Group(String beginnig, String duration, Student[] students, Course courses) {
        this.beginnig = beginnig;
        Duration = duration;
        this.students = students;
        this.courses = courses;
    }

    public String getBeginnig() {
        return beginnig;
    }

    public void setBeginnig(String beginnig) {
        this.beginnig = beginnig;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return String.format("\nДата начала: %s\n" +
                "Длительность в месяцах: %s\n" +
                "\nСтуденты: %s\n" +
                "\nКурс:\n%s",beginnig,Duration,Arrays.toString(students),courses);
    }
}
