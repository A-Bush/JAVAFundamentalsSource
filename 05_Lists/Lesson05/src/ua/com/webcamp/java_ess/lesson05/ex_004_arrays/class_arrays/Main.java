package ua.com.webcamp.java_ess.lesson05.ex_004_arrays.class_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // ������ ������ Arrays

        int[] arr = {2, 12, 3, 124, 55, 22};
        int[] arr2 = {56, 78, 23,};

        // ���������� �������

        Arrays.sort(arr);

        // ����� �������(������� ����� � ������,
        // ������� �������� ������

        System.out.println(arr);

        // ����� ����� toString ������� ��� ����������

        System.out.println(Arrays.toString(arr));

        // ����� �������� � �������

        System.out.println(Arrays.binarySearch(arr, 12));

        // ���������� �������

        System.out.println(Arrays.equals(arr, arr2));

        // �������� ������� � ������

        Arrays.fill(arr, 12);
        System.out.println(Arrays.toString(arr));
    }
}
