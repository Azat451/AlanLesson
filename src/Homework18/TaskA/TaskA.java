package Homework18.TaskA;

public class TaskA {
    public static void main(String[] args) {

        Farm[] farms = new Farm[2];
        //________________
        Cow[] cowsFarms1 = new Cow[5];
        cowsFarms1[0] = new Cow(145.90,35,false,"cow1");
        cowsFarms1[1] = new Cow(125.35,20,true,"cow2");
        cowsFarms1[2] = new Cow(140.15,12,false,"cow3");
        cowsFarms1[3] = new Cow(50.3,5,true,"cow4");
        cowsFarms1[4] = new Cow(75.9,9,false,"cow5");
        //________________
        Sheep[] sheepFarms1 = new Sheep[3];
        sheepFarms1[0] = new Sheep(95.9,16,false,"sheep1");
        sheepFarms1[1] = new Sheep(105.05,13,true,"sheep2");
        sheepFarms1[2] = new Sheep(45.1,9,true,"sheep3");
        // false - male, true - female: создал отдельные кнопки для облегчение
        Horse[] horseFarms1 = new Horse[2];
        horseFarms1[0] = new Horse(95.05,18,false,"horse1");
        horseFarms1[1] = new Horse(102.12,19,true,"horse2");

        farms[0] = new Farm("Киевская",cowsFarms1,sheepFarms1,horseFarms1,
                "Сергей Малахов","Farms1");
        //________________
        Cow[] cowFarms2 = new Cow[1];
        cowFarms2[0] = new Cow(125.35,5,true,"cow1");
        //________________
        Sheep[] sheepFarms2 = new Sheep[1];
        sheepFarms2[0] = new Sheep(96.02,12,true,"sheep1");
        //________________
        Horse[] horseFarms2 = new Horse[1];
        horseFarms2[0] = new Horse(95.05,12,false,"horse1");

        farms[1] = new Farm("Тулебердиева",cowFarms2,sheepFarms2,horseFarms2,
                "Азиз Маратов","Farms2");
        //________________
        System.out.println(farms[0]);
        System.out.println(farms[1]);
    }
}
