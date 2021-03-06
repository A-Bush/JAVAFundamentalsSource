package ua.com.webcamp.java_ess.lesson4.interfaces.ex005_interfaces;

/**
 * Наследование от интерфейсов у которых совпадают имена членов.
 *
 * Объединение реализации одноименных абстрактных членов.
 */
interface Interface1 {
    void method();
}

interface Interface2 {
    void method();
}

class ConcreteClass implements Interface1, Interface2 {
    public void method() {
        System.out.println("method - реализация интерфейса Interface (1-2)");
    }
}
public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();

        Interface1 instance1 = instance;
        instance1.method();

        Interface2 instance2 = instance;
        instance2.method();
    }
}
