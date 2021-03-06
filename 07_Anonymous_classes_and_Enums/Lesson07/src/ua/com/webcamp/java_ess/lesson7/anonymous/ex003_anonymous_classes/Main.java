package ua.com.webcamp.java_ess.lesson7.anonymous.ex003_anonymous_classes;

/**
 * ��������� ������.
 */
interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // ���������� ���������� (�����������) ������
        Interface instance = new Interface() {
            public int publicField = 3;

            @Override
            public void method() {
                publicField = 1234;
                System.out.println("instance1: publicField = " + getPublicField());
            }

            public int getPublicField() {
                return publicField;
            }
        };

        instance.method();

        // ����� �� ��������
        //System.out.println(instance.getPublicField());
    }
}
