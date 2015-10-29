package ua.com.webcamp.java_ess.lesson4.interfaces.ex006_interfaces;

/**
 * Наследование абстрактных классов от интерфейсов.
 */
interface Interface {
    void method();
}

abstract class AbstractClass implements Interface {
    // Реализация абстрактного метода из интерфейса, в абстрактном классе обязательна.
    public void method() {
        System.out.println("Метод - реализация интерфейса в абстрактном классе.");
    }
}

class ConcreteClass extends AbstractClass {

}
public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
