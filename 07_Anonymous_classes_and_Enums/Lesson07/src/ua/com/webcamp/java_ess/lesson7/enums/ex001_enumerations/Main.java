package ua.com.webcamp.java_ess.lesson7.enums.ex001_enumerations;

/**
 * ������������� ���� (enum).
 */
enum Day {
    MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        // ������ �� ������� �� ��������� �������������� ���� Day.
        Day today = Day.SATURDAY;
        System.out.println("Today is " + today);

        int number = 4;
        // ������ ��������� �������� ������ ����.
        //today = number;
        //today = 4;
    }

}

