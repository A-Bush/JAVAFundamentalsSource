package ua.com.webcamp.java_ess.lesson05.ex_002_arrays.rewrite;

public class Main {
    public static void main(String[] args) {

        // �������� ������� ������������ 5

        int[] arr1 = new int[5];
        System.out.println(arr1.length);

        //���������� �������(������� ����� ������).
        // �� ���� �� ������� ����� ������ (����� "new"), � �� ���������� ������ ��� ��� ������. �� ������������ ����� ���� ������ ��������� ������.

        arr1 = new int[25];
        System.out.println(arr1.length);
    }
}
