package ua.com.webcamp.java_ess.lesson3.ex010_super_method;

public class DerivedClass extends BaseClass {
    // ��������������� ������ �������� ������.

    @Override
    public void method()
    {
        // ����� ������ �������� ������.
        super.method();

        System.out.println("method from DerivedClass");
    }
}
