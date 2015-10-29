package ua.com.webcamp.java_ess.lesson08.ex010_exceptions;

/**
 * Обработка исключений.
 * <p>
 * finally - не срабатывает если не завершается работа блока catch.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            while (true) System.out.println("Catch");
        } finally {
            // finally - не сработает!
            while (true) System.out.println("Finally");
        }
    }
}
