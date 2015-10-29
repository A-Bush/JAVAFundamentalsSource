package ua.com.webcamp.java_ess.lesson10.ex003_generics;

/**
 * ”ниверсальные шаблоны. (”ниверсальный метод)
 */
class MyClass {
    public <T> void method(T argument) {
        T variable = argument;

        System.out.println(variable);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance = new MyClass();

        instance.method("Hello world!");
    }
}
