package ua.com.webcamp.java_ess.lesson02.ex_008_static.methods;

public class Main {

    private int count;

    public static void main(String[] args) {

        // ����� ������������ ������ � ������� ������

        Main.doSmth(); // ����� �����
        doSmth();      // � ����� ������, ��� �������������� ������

        // ����� �� ������� �� �������. ������

        // System.out.println(Main.count);

    }

    public static void doSmth() {
        System.out.println("Hello !");
    }
}
