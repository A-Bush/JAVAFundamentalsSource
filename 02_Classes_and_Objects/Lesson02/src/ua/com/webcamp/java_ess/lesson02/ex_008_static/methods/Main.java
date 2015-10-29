package ua.com.webcamp.java_ess.lesson02.ex_008_static.methods;

public class Main {

    private int count;

    public static void main(String[] args) {

        // вызов статического метода с помощью класса

        Main.doSmth(); // через Класс
        doSmth();      // в самом классе, без использованияя класса

        // вызов НЕ статики из статики. Ошибка

        // System.out.println(Main.count);

    }

    public static void doSmth() {
        System.out.println("Hello !");
    }
}
