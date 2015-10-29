package ua.com.webcamp.java_ess.lesson3.ex004_constractors;

/**
 * Наследование.
 */
public class BaseClass {
    public int baseNumber;

    // Конструктор по умолчанию.
    public BaseClass()
    {
    }

    // Пользовательский конструктор.
    public BaseClass(int number)
    {
        this.baseNumber = number;
    }
}
