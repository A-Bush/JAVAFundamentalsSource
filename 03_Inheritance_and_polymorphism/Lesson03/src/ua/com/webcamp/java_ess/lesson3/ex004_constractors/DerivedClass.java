package ua.com.webcamp.java_ess.lesson3.ex004_constractors;

/**
 * ������������
 */
public class DerivedClass extends BaseClass {
    public int derivedField;

    // ����������� �� ���������.
    public DerivedClass()
    {
    }

    // ���������������� �����������.
    // ���������� ���������������� ����������� �������� ������, ��� ���� �� �����,
    // ����������� ��������, �������������� ������ � ������������ ������������ ������.
    public DerivedClass(int number1, int number2)
    {
        super(number1);
        derivedField = number2;
    }
}
