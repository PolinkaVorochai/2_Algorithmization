package part_2.module_4.task_13;

/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n],
где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.
 */
public class Task_13 {
    private int n;

    public static void main(String[] args) {
        Task_13 task13 = new Task_13();
        task13.setN(4);
        task13.result();
    }

    public void setN(int n) {
        if (n > 2) {
            this.n = n;
        } else {
            System.out.println("Число n должно быть >2");
        }
    }

    //определение простого числа
    private boolean simpleNumber(int number) {
        boolean simpleNumber = false;
        int gcd = 1;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                gcd = i;
            }
        }
        if (gcd == 1) {
            simpleNumber = true;
        }
        return simpleNumber;
    }

    void result() {
        for (int i = n; i < 2 * n; i++) {
            if (simpleNumber(i) && simpleNumber(i + 2)) {
                System.out.println("пара простых чисел: " + i + ", " + (i + 2));
            }
        }
    }
}
