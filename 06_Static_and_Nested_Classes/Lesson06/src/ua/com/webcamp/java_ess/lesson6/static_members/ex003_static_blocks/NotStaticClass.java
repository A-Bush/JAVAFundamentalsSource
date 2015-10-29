package ua.com.webcamp.java_ess.lesson6.static_members.ex003_static_blocks;

/**
 * ����������� �����.
 * ����������� ���� ����������, ����� ����� ������������ � ������.
 */
public class NotStaticClass {
    public static final int X;


    // ����������� ����.
    static {
        X = 10;
        System.out.println("Static block  X = " + X);
    }

    public NotStaticClass() {
        // X = 4; // ������, ��� ��� ����������� ���� ���������� ������, ��� �����������.
        System.out.println("Constructor  X = " + X);
    }
}
