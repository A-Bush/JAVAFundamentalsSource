package ua.com.webcamp.java_ess.lesson02.ex_001_class_object.declaration;

// ����� Car ������ ���������� ����� Object

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        // ������� ������ ������ Car. � ���� ��� ���� ������ ������ Object.

        Main main = new Main();
        // main.

        // ������ ������ Car ���� ����� ������ ������ Object
        Car car = new Car();
        // car.
    }
}

// ����� Car ���� ����������� �� ������ Object

class Car extends Object {
}
