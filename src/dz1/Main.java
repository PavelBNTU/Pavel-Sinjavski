package dz1;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Animal: " + name);
    }
}

// Создаем класс Car
class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("Car: " + brand);
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        // Создаем массив объектов разных классов
        Object[] objects = new Object[4];
        objects[0] = new Animal("Dog");
        objects[1] = new Car("Toyota");
        objects[2] = new Animal("Cat");
        objects[3] = new Car("Honda");

        // Печатаем информацию об объектах в консоль
        for (Object obj : objects) {
            if (obj instanceof Animal) {
                Animal animal = (Animal) obj;
                animal.printInfo();
            } else if (obj instanceof Car) {
                Car car2 = (Car) obj;
                car2.printInfo();
            }
        }
    }
}