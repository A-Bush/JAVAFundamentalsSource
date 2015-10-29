package ua.com.webcamp.java_ess.lesson6.static_members.ex007_static;

/**
 * Статические члены не могут быть переопределенными и абстрактными.
 *
 * Статические члены поддерживают замещение.
 */
abstract class BaseClass {
    //public abstract static void abstractStaticMethod(); // Error

    public static void staticMethod() {
        System.out.println("BaseClass.staticMethod");
    }
}

class DerivedClass extends BaseClass {
    public static void staticMethod() {
        System.out.println("DerivedClass.staticMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        BaseClass.staticMethod();
        DerivedClass.staticMethod();
    }
}
