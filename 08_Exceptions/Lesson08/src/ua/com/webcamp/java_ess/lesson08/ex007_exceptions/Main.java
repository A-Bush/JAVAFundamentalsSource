package ua.com.webcamp.java_ess.lesson08.ex007_exceptions;

/**
 * ��������� ����������.
 */
public class Main {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            System.out.println("������� ������� �� ����.");
            System.out.println("a / (2 - n) = " + (a / (2 - n)));
        } catch (Exception e) {
            System.out.println("��������� ����������.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("���� finally.");
        }

        System.out.println("����� ����.");
    }
}
