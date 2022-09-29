package part_2.module_4.task_7;

/*
Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task_7 {
    public static void main(String[] args) {
        System.out.println("summa factorials: " + sum());
    }

    //вычисление факториала любого числа
    private static int factorial(int number) {
        int result = 1;
        if (number == 1) {
            return result;
        } else {
            result = factorial(number - 1) * number;
        }
        return result;
    }

    //вычисление суммы факториалов всех нечетных чисел от 1 до 9
    static int sum() {
        int result = 0;
        for (int i = 1; i < 10; i += 2) {
            result += factorial(i);
        }
        return result;
    }
}
