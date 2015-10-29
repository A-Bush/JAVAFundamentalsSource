package ua.com.webcamp.java_ess.lesson1.ex_007_packages02_import;

import ua.com.webcamp.java_ess.lesson1.ex_001_class_declaration.Car;

public class Main {
    public static void main(String[] args) {
        // Если класс(Машина) лежит в другом пакете, то что бы его использовать в Классе Main - его надо импортировать
        Car myCar = new Car();
    }
}
