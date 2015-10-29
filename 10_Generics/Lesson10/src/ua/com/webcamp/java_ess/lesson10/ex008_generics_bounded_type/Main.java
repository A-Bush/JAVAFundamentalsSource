package ua.com.webcamp.java_ess.lesson10.ex008_generics_bounded_type;

/**
 * ����������� ���������� ����
 */
interface Interface1 { /* ... */
}

interface Interface2<U> { /* ... */
}

class Derived implements Interface1, Interface2<Object> { /* ... */
}

// T extends Interface1 � T extends Interface2<Object>  -  �������� ���� ������ �������� ��� ������������� ��������� ���������.
// �������������� ��������� ����� ����� ���� �������������.

class MyClass1<T extends Interface1> { /* ... */
}

class MyClass2<T extends Interface2<Object>> { /* ... */
}

public class Main {
    public static void main(String[] args) {
        MyClass1<Interface1> my1 = new MyClass1<Interface1>();
        MyClass1<Derived> my2 = new MyClass1<Derived>();

        MyClass2<Interface2<Object>> my3 = new MyClass2<Interface2<Object>>();
        MyClass2<Derived> my4 = new MyClass2<Derived>();
    }
}
