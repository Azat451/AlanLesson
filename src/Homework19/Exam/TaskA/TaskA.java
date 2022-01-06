package Homework19.Exam.TaskA;

public class TaskA {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(2000,"Smith","Dan",false,65);
        students[1] = new Student(1998,"Smith","Garsian",false,19);
        students[2] = new Student(2003,"Smith","Caede",true,17);
        Course course = new Course("Програмирования","14.9.18","id174578","Азамат Щульц Петрович");
        Group group = new Group("20.9.17","12",students,course);

        Lesson lesson = new Lesson(group.getBeginnig(), group.getDuration(),"17:00 - 21:00",course,true,false,students);

        System.out.println(lesson);

    }
}
