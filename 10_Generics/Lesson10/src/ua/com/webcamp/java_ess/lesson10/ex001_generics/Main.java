package ua.com.webcamp.java_ess.lesson10.ex001_generics;

/**
 * ������������� �������.
 * �� 8-� ������ ������� ����� � ������ MyClass, ������������������� ���������� ����� ���������� ����� - T
 */
class MyClass<T> {
    public T field;

    public void method() {
        System.out.println(field.getClass());
    }
}

public class Main {
    public static void main(String[] args) {
        // ������� ��������� ������ MyClass � � �������� ��������� ���� (��� MyClass) �������� ��� String.
        MyClass<String> instance1 = new MyClass<String>();
        instance1.field = "ABC";
        instance1.method();

        //// � �������� ��������� ���� ���������� ����������� ���� (int, long, float, double, � ��� �����) ������.
        //MyClass<int> instance2 = new MyClass<int>();
        //instance2.method();

        // ������� ��������� ������ MyClass � � �������� ��������� ���� (��� MyClass) �������� ��� Integer.
        MyClass<Integer> instance2 = new MyClass<Integer>();
        instance2.field = 1234;
        instance2.method();


    }
}
