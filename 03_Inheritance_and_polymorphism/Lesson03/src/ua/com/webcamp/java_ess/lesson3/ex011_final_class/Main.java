package ua.com.webcamp.java_ess.lesson3.ex011_final_class;

final class FinalClass
{
    public int x;
    public int y;
}

// ������� ������������ �� FinalClass �������� � ������ �����������.

class DerivedClass { //extends FinalClass {   // Error

}

public class Main {
    static void main() {
        FinalClass instance = new FinalClass();
        instance.x = 100;
        instance.y = 200;

        System.out.println("x = " + instance.x + "y = " + instance.y);
    }
}
