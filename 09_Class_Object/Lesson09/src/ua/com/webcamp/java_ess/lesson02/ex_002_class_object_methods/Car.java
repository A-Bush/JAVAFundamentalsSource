package ua.com.webcamp.java_ess.lesson02.ex_002_class_object_methods;

public class Car {

    // ������� ����

    private int speed;
    private String color;

    // �����������

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    // ������ �������

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // �������������� ����� toString ������ Object ��� ��� �� ������� �����

    @Override
    public String toString() {
        return String.format("Speed is: %s\nColor is: %s", speed, color);
    }

    // ���������� �� �������� ��� ������� ���� � ���������� ����� ���������� �������� � ������

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}
