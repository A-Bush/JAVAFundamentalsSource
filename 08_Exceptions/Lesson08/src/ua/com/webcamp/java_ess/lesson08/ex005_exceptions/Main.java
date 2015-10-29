package ua.com.webcamp.java_ess.lesson08.ex005_exceptions;

/**
 * ��������� ����������.
 * <p>
 * ��� �������� ����������������� ����������, ��������� ������������ �� Exception.
 */
class UserException extends Exception {
    public void method() {
        System.out.println("��� ����������!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println("��������� ����������.");
            e.method();
        }
    }
}
