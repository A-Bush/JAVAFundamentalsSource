package ua.com.webcamp.java_ess.lesson6.nested_classes.ex001_nestedclasses;

/**
 * ��������� ������.
 */
class MyClass {
    public class Nested {
        public void method() {
            System.out.println("����� �� Nested ������");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();

        instance.method();
    }
}
