package ua.com.webcamp.java_ess.lesson08.ex001_exceptions;

/**
 * ��������� ����������.
 */
public class Main {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            // ������� ������� �� ����.
            a = a / (2 - n);

            System.out.println("a = " + a);
        } catch (Exception e) {
            System.out.println("��������� ����������.");
            System.out.println(e.getMessage());
        }
    }
}
