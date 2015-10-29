package ua.com.webcamp.java_ess.lesson02.ex_002_class_object_methods;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(160, "blue");

        // возвращает Класс объекта
        System.out.println(car.getClass());

        // благодаря перезаписаному методу toString выведет информацию в нужном нам виде
        System.out.println(car);
    }
}
