package part_2.module_4.task_14;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга,
если сумма его цифр, возведенная в степень n, равна самому числу.
Найти все числа Армстронга от 1 до k.
Для решения задачи использовать декомпозицию.
 */
public class Task_14 {
    private int k;

    public static void main(String[] args) {
        Task_14 task14 = new Task_14();
        task14.setK(5000);
        task14.result();
    }

    public void setK(int k) {
        if (k > 1) {
            this.k = k;
        } else {
            System.out.println("Число k должно быть больше 1");
        }
    }

    //количество цифр в числе
    private int numberLength(int number) {
        return (int) Math.log10(number) + 1;
    }

    //сумма цифр в числе в степени n
    private int summaNumberInPow(int number) {
        int lengthNumber = numberLength(number);//количество цифр в числе(для определения количества итераций)
        int summa = 0;
        int j = 10;
        for (int i = 0; i < lengthNumber; i++) {
            summa += Math.pow(number % j, lengthNumber);
            number /= 10;
        }
        return summa;
    }

    void result() {
        System.out.println("Числа Армстронга на промежутке от 1 до " + k + ": ");
        for (int i = 1; i < k; i++) {
            if (summaNumberInPow(i) == i) {
                System.out.print(i + ", ");
            }
        }
    }
}
