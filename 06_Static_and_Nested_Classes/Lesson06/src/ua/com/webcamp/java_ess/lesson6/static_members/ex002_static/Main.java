package ua.com.webcamp.java_ess.lesson6.static_members.ex002_static;

/**
 * � ����������� ������� ������ ���������� � ������������� �����.
 */
public class Main {
    public static void main(String[] args) {
        NotStaticClass instance = new NotStaticClass(1);

        NotStaticClass.Method();
    }
}
