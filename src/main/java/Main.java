package main.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalOrLower = new ArrayList<>();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(2);
        Dog dog = new Dog();

        animalOrLower.add(dog);
        animalOrLower.add(animal1);
        animalOrLower.add(animal2);

        test(animalOrLower);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog);

        test(dogList);

        List<Object> objectList = new ArrayList<>();
        objectList.add(animal1);
        objectList.add(new Object());

        test2(objectList);
    }

    public static void test(List<? extends Animal> animalList) {
        for (Object animal : animalList)
            System.out.println(animal.toString());
    }

    public static void test2(List<? super Animal> animalOrHigher) {
        for (Object object : animalOrHigher) {
            System.out.println(object.toString());
        }
    }
}
