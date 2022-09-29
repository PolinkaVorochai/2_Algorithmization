package part_2.module_4.task_17;

/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию.
 */
public class Task_17 {
    private int number;

    public static void main(String[] args) {
        Task_17 task17 = new Task_17();
        task17.setNumber(305);
        task17.result();
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        } else {
            System.out.println("Введите число >0");
        }
    }

    //количество цифр в числе
    private int numberLength(int number) {
        return (int) Math.log10(number) + 1;
    }

    //сумма цифр в числе
    private int summaNumber(int number) {
        int summa = 0;
        int j = 10;
        int lengthNumber = numberLength(number);
        for (int i = 0; i < lengthNumber; i++) {
            summa += number % j;
            number /= 10;
        }
        return summa;
    }

    void result() {
        int count = 0;
        System.out.println("Заданное число: " + number);
        do {
            number -= summaNumber(number);
            count++;
            System.out.println("Остаток после " + count + " вычитания = " + number);
        } while (number != 0);
        System.out.println("Количество вычитаний: " + count);
    }
}
