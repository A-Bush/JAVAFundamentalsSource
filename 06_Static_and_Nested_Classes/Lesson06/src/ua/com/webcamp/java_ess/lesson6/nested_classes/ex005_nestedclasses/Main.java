package ua.com.webcamp.java_ess.lesson6.nested_classes.ex005_nestedclasses;

import java.lang.Math;
/**
 * ��������� ������.
 */
class MyClass extends BaseClass {
    public class Nested // ������������ �� BaseClass �� ����������������.
    {
        public void methodFromNested() {
            System.out.println("����� Nested ������.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyClass instance1 = new MyClass();
        instance1.methodFromBase();

        MyClass.Nested instance2 = new MyClass().new Nested();
        instance2.methodFromNested();
    }
}
