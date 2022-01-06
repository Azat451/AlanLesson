package Homework8;

public class TaskC {
    public static void main(String[] args) {
        int finish = 0;
        for (int i = 1;i < 11;i++) {
            for (int h = 1; h < 11;h++) {
                finish = i * h;
                System.out.printf("%d * %d = %d\n", i, h, finish);
            }
        }
    }
}
