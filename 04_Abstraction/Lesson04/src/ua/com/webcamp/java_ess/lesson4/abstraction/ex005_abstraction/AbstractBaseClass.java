package ua.com.webcamp.java_ess.lesson4.abstraction.ex005_abstraction;

public abstract class AbstractBaseClass {
    // 1.
    // ����� ���������� ������������ ������ ��� ��� ������������ �� ����������� ������.
    public void simpleMethod() {
        System.out.println("AbstractBaseClass.simpleMethod");
    }

    // 2.
    // ����������� ����� - ����������� � ����������� ������.
    abstract public void abstractMethod();
}
