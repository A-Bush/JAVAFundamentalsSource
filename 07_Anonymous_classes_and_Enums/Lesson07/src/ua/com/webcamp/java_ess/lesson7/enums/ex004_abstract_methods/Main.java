package ua.com.webcamp.java_ess.lesson7.enums.ex004_abstract_methods;


/**
 * ������������� ���� (enum).
 */

public class Main {
    public static void main(String[] args) {
        // ������ �� ������� �� ��������� �������������� ���� Company.
        Company myComp = Company.WEBCAMP;
        System.out.println(myComp);

        // ����� �������.
        int salary = myComp.getValue();
        String currency = myComp.getCurrency();
        System.out.println("� ����������� " + salary + " " + currency + " � �����");
    }
}
