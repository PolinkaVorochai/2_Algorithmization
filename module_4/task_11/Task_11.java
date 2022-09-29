package part_2.module_4.task_11;

/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Task_11 {
    int number1;
    int number2;

    public static void main(String[] args) {
        Task_11 task11 = new Task_11();
        task11.setNumber1(1248);
        task11.setNumber2(245879546);
        task11.result();
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    private int numberLength(int number) {
        return (int) Math.log10(number) + 1;
    }

    public void result() {
        if (numberLength(number1) > numberLength(number2)) {
            System.out.println("В числе " + number1 + " больше цифр");
        } else if (numberLength(number1) == numberLength(number2)) {
            System.out.println("В числах " + number1 + ", " + number2 + " одинаковое количетво цифр");
        } else {
            System.out.println("В числе " + number2 + " больше цифр");
        }
    }
}
