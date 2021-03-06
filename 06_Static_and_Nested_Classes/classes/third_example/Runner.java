package smartgrabber.classes.third_example;

/*Класс Rector объявлен в методе createTeacher(int id), и, соответственно,
        объекты этого класса можно создавать только внутри метода, из любого дру-
        гого места внешнего класса внутренний класс недоступен. Однако существу-
        ет возможность получить ссылку на класс, объявленный внутри метода, и ис-
        пользовать его специфические свойства, как в данном случае, при наследова-
        нии внутренним классом функциональности обычного класса, в частности,
        AbstractTeacher. При компиляции данного кода с внутренним классом ассоци-
        ируется объектный модуль со сложным именем TeacherCreator$1Rector.class,
        тем не менее однозначно определяющим связь между внешним и внутренним
        классами. Цифра 1 в имени говорит о том, что потенциально в других методах
        класса могут быть объявлены внутренние классы с таким же именем.*/
public class Runner {
    public static void main(String[ ] args) {
        TeacherLogic tl = new TeacherLogic();
        tl.excludeProcess(777, "Олейников");
        tl.excludeProcess(6, "Олейников");
    }
}