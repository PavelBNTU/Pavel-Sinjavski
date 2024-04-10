package org.example;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.example.model.Animal;
import org.example.model.Car;
import org.example.model.Flower;
import org.example.model.House;
import org.example.model.Person;
import org.example.util.Util;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
    }

    private static void task1() throws IOException {
        List<Animal> animals = Util.getAnimals();
        List<Animal> youngAnimals = animals.stream()
                .filter(animal -> animal.getAge() >= 10 && animal.getAge() <= 20)
                .sorted(Comparator.comparingInt(Animal::getAge))
                .collect(Collectors.toList());

        int animalsPerZoo = 7;
        int zooNumber = 3;
        int startIndex = (zooNumber - 1) * animalsPerZoo;
        int endIndex = Math.min(startIndex + animalsPerZoo, youngAnimals.size());

        List<Animal> animalsForZoo = youngAnimals.subList(startIndex, endIndex);

        animalsForZoo.forEach(System.out::println);
    }

    private static void task2() throws IOException {
        List<Animal> animals = Util.getAnimals();
    }

    private static void task3() throws IOException {
        List<Animal> animals = Util.getAnimals();
    }

    private static void task4() throws IOException {
        List<Animal> animals = Util.getAnimals();
    }

    private static void task5() throws IOException {
        List<Animal> animals = Util.getAnimals();
    }

    private static void task6() throws IOException {
        List<Animal> animals = Util.getAnimals();
    }

    private static void task7() throws IOException {
        List<Animal> animals = Util.getAnimals();
    }

    private static void task8() throws IOException {
        List<Animal> animals = Util.getAnimals();
    }

    private static void task9() throws IOException {
        List<Animal> animals = Util.getAnimals();
    }

    private static void task10() throws IOException {
        List<Animal> animals = Util.getAnimals();
    }

    private static void task11() throws IOException {
        List<Animal> animals = Util.getAnimals();
    }

    private static void task12() throws IOException {
        List<Person> people = Util.getPersons();
    }

    private static void task13() throws IOException {
        List<House> houses = Util.getHouses();
    }

    private static void task14() throws IOException {
        List<Car> cars = Util.getCars();
    }

    private static void task15() throws IOException {
        List<Flower> flowers = Util.getFlowers();
    }
}
