package ua.com.webcamp.java_ess.lesson3.ex004_constractors;

/**
 * Ќаследование
 */
public class DerivedClass extends BaseClass {
    public int derivedField;

    //  онструктор по умолчанию.
    public DerivedClass()
    {
    }

    // ѕользовательский конструктор.
    // ¬ызываетс€ пользовательский конструктор базового класса, при этом не нужно,
    // присваивать значени€, унаследованным членам в конструкторе производного класса.
    public DerivedClass(int number1, int number2)
    {
        super(number1);
        derivedField = number2;
    }
}
