package ua.com.webcamp.java_ess.lesson6.nested_classes.ex004_nestedclasses;

/**
 * ��������� ������.
 */
class MyClass { // ������������ �� BaseClass �� ����������������.
    public class Nested extends BaseClass {
        public void methodFromNested() {
            System.out.println("����� Nested ������.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();

        instance.methodFromBase();
        instance.methodFromNested();
    }
}
