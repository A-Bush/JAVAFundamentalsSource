package ua.com.webcamp.java_ess.lesson6.nested_classes.ex006_nestedclasses;

/**
 * ��������� ������.
 * ������ ����� � ���� ��������� ����������� Nested ������.
 */
public class MyClass {
    public static class Nested {
        public static void staticMethodFromNested() {
            System.out.println("����������� ����� Nested ������.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyClass.Nested.staticMethodFromNested();
    }
}
