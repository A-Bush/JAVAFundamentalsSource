package ua.com.webcamp.java_ess.lesson6.static_members.ex006_abstract_class;

public abstract class AbstractClass {
    // Статический фабричный метод.
    public static AbstractClass CreateObject() {
        return new ConcreteClass();
    }

    public abstract void Method();
}
