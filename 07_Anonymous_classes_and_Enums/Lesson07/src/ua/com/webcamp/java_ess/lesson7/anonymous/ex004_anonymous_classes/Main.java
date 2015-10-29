package ua.com.webcamp.java_ess.lesson7.anonymous.ex004_anonymous_classes;

/**
 * јнонимные классы.
 * Ћокальные переменные доступны в блоке объ€влени€ анонимного класса.
 */
interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // Ћокальные переменные доступны в блоке объ€влени€ анонимного класса
        int N = 100;

        // ќбъ€вление анонимного (внутреннего) класса
        Interface instance = new Interface() {
            public int publicField = 11;

            @Override
            public void method() {
                publicField = N;
                System.out.println("instance: n = " + publicField);
            }
        };

        instance.method();
    }
}
