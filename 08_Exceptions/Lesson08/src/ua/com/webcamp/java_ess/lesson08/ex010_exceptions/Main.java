package ua.com.webcamp.java_ess.lesson08.ex010_exceptions;

/**
 * ��������� ����������.
 * <p>
 * finally - �� ����������� ���� �� ����������� ������ ����� catch.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            while (true) System.out.println("Catch");
        } finally {
            // finally - �� ���������!
            while (true) System.out.println("Finally");
        }
    }
}
