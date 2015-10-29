package ua.com.webcamp.java_ess.lesson7.enums.ex004_abstract_methods;

/**
 * ������������� ���� (enum).
 */
public enum Company {
    // ����������.
    WEBCAMP(1000) {
        // ����� �������������� ������ ��� ��������� �����������.
        @Override
        public int getValue() {
            return 10 + this.value;
        }

        // ����������� ������ ����������� ������ ���� �������������� � ����������� ������������� �����.
        @Override
        public String getCurrency() {
            return "dollars";
        }
    }, GOOGLE(100) {
        // ����������� ������ ����������� ������ ���� �������������� � ����������� ������������� �����.
        @Override
        public String getCurrency() {
            return "cents";
        }
    }, SKYNET(10) {
        // ����� �������������� ������ ��� ��������� �����������.
        @Override
        public String toString() {
            return "Company: " + super.toString();
        }

        // ����������� ������ ����������� ������ ���� �������������� � ����������� ������������� �����.
        @Override
        public String getCurrency() {
            return "euros";
        }
    }; //, TEST, TEST2(1000, "string"); // - Error
    int value;

    // ����������� ����� ���� ������ private.
    Company(int value) {
        this.value = value;
    }

    // ����� �������������� ������ "��� ����" ����������� �������������� ����.
    @Override
    public String toString() {
        return "Company: " + super.toString() + ", salary = " + getValue() + " " + getCurrency();
    }

    public int getValue() {
        return value;
    }

    public abstract String getCurrency();
}