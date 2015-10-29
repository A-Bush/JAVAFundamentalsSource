package ua.com.webcamp.java_ess.lesson02.ex_004_class_object_equals_overriden;

public class Car {

    private int id;

    public Car(int id) {
        this.id = id;
    }

    // �������������� ����� equals

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        if (id != car.id) return false;
        return true;
    }
}
