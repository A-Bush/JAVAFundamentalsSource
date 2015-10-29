package ua.com.webcamp.java_ess.lesson08.ex002_exceptions;

/**
 * Обработка исключений.
 */
public class Main {
    public static void main(String[] args) {
        Exception ex = new Exception("Мое Исключение");

        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        }
    }
}
