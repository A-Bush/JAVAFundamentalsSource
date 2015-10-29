package ua.com.webcamp.java_ess.lesson6.nested_classes.ex002_nestedclasses;

/**
 * ��������� ������.
 */
class MyClass {
    private static int field = 0;

    public class Nested {
        public void method(int a) {
            field = a;

            System.out.println(field);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();

        instance.method(1);
    }
}
