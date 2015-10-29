package ua.com.webcamp.java_ess.lesson1.ex_002_access_modifiers;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();

        shape.square = 24.0; // доступ к паблик полю
        System.out.println(shape.square);

        //задаем параметры нашему объекту

        shape.setHeight(200);
        shape.getHeight();

        shape.setLength(144);
        shape.getLength();

      // выводим объект через метод

        shape.viewShape();
    }
}
