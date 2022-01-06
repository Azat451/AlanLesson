package Homework16.TaskA.ASD;

import Homework16.TaskA.Cat;
import Homework16.TaskA.Dog;
import Homework16.TaskA.Fish;
import Homework16.TaskA.Parrot;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик",456,"Охотится на мелких зверей");
        Fish fish = new Fish("Титаник",45,"Плавать под водой");
        Dog dog = new Dog("Фас!",34,"Догонять");
        Parrot parrot = new Parrot("Камикадзе",78,"Летать и падать");
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(fish);
        System.out.println(parrot);
    }
}
