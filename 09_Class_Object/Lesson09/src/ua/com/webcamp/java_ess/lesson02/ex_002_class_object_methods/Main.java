package ua.com.webcamp.java_ess.lesson02.ex_002_class_object_methods;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(160, "blue");

        // ���������� ����� �������
        System.out.println(car.getClass());

        // ��������� �������������� ������ toString ������� ���������� � ������ ��� ����
        System.out.println(car);
    }
}
