package ua.com.webcamp.java_ess.lesson4.interfaces.ex007_interfaces;

/**
 * Наследование абстрактных классов от интерфейсов.
 */
interface Interface {
    void method();
}

abstract class AbstractClass implements Interface {
    // Замещение абстрактного метода из интерфейса, в абстрактном классе обязательно.
    public abstract void method();
}

class ConcreteClass extends AbstractClass {
    // Реализация абстрактного метода из абстрактного класса, в конкретном классе обязательна.
    public void method() {
        System.out.println("Метод - реализация интерфейса в абстрактном классе.");
    }
}
public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
