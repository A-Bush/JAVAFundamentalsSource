package ua.com.webcamp.java_ess.lesson6.static_members.ex002_static;

public class NotStaticClass {
    private int id;

    // �����������.
    public NotStaticClass(int id) {
        this.id = id;
    }

    public static void Method() {
        //System.out.println("Instance.Id = {0}", Id);

        System.out.println("� ����������� ������� ������ ���������� � ������������� �����.");
    }
}
