package ua.com.webcamp.java_ess.lesson7.enums.ex003_enumerations;

/**
 * ѕеречисл€емые типы (enum).
 *  оструктор и методы.
 */
enum Company {
    // Ёкземпл€ры.
    WEBCAMP(1000), GOOGLE(100), SKYNET(10); //, TEST, TEST2(1000, "string"); // - Error
    int value;

    //  онструктор может быть только private.
    Company(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Company myComp = Company.WEBCAMP;
        System.out.println("я работаю в компании " + myComp + " и зарабатываю " + myComp.getValue() + "$ в мес€ц.");
    }
}
