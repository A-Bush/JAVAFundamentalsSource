package ua.com.webcamp.java_ess.lesson4.interfaces.ex003_interfaces;

public class DerivedClass extends BaseClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Реализация метода method1() из Interface1");
    }

    public void method2() {
        System.out.println("Реализация метода method2() из Interface2");
    }
}
