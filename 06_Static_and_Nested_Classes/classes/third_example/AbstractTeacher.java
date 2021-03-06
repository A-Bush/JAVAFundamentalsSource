package smartgrabber.classes.third_example;

/*Внутренний класс может быть объявлен также внутри метода или логичес­
        кого блока внешнего (owner) класса. Видимость такого класса регулируется
        областью видимости блока, в котором он объявлен. Но внутренний класс со-
        храняет доступ ко  всем полям и  методам внешнего класса, а  также ко  всем
        константам, объявленным в текущем блоке кода. Класс, объявленный внутри
        метода, не может быть объявлен как static, а также не может содержать стати-
        ческие поля и методы.*/
public abstract class AbstractTeacher {
    private int id;

    public AbstractTeacher(int id) {
        this.id = id;
    }

    /* методы */
    public abstract boolean excludeStudent(String name);
}
