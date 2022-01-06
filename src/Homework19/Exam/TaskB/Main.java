package Homework19.Exam.TaskB;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread(245.05,20,"HBK");
        Lepeshka lepeshka = new Lepeshka(0,15,"HBK",10);
        Pita pita = new Pita(102.05,22,"НВК","Элитный ");
        Baget baget = new Baget(325.05,35,"НВК","Провансальский ","12cm",6);

        System.out.println(bread);
        System.out.println("___________");
        System.out.println(lepeshka);
        System.out.println("___________");
        System.out.println(pita);
        System.out.println("___________");
        System.out.println(baget);
    }
}
