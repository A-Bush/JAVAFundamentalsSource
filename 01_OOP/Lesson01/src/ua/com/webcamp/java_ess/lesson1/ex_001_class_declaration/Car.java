package ua.com.webcamp.java_ess.lesson1.ex_001_class_declaration;
// ќбъ€вление класса (пол€, конструктор, медоты)
public class Car {

    private String model;
    private int maxSpeed;
    private int year;
    private int speed;

    public Car() {
    }

    public Car(String model, int maxSpeed, int year, int speed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
