package ua.com.webcamp.java_ess.lesson7.anonymous.ex004_anonymous_classes;

/**
 * ��������� ������.
 * ��������� ���������� �������� � ����� ���������� ���������� ������.
 */
interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // ��������� ���������� �������� � ����� ���������� ���������� ������
        int N = 100;

        // ���������� ���������� (�����������) ������
        Interface instance = new Interface() {
            public int publicField = 11;

            @Override
            public void method() {
                publicField = N;
                System.out.println("instance: n = " + publicField);
            }
        };

        instance.method();
    }
}
