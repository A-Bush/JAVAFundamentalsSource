package ua.com.webcamp.java_ess.lesson08.ex003_exceptions;

/**
 * ��������� ����������.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("��� ����������");
        } catch (Exception e) {
            System.out.println("��������� ����������.");
            System.out.println(e.getMessage());
        }
    }
}
