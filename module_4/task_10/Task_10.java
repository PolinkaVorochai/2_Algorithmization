package part_2.module_4.task_10;

import java.util.Arrays;

/*
Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N
 */
public class Task_10 {
    int n;

    public static void main(String[] args) {
        Task_10 task10 = new Task_10();
        task10.setN(14865);
        task10.result();
    }

    public void setN(int n) {
        if (n > 0) {
            this.n = n;
        } else {
            System.out.println("Число n должно быть натуральным");
        }
    }

    private int lengthArray() {
        int length = (int) (Math.log10(n) + 1);
        return length;
    }

    public void result() {
        int[] result = new int[lengthArray()];
        int i = 10;
        int number = n;
        for (int j = 0; j < result.length; j++) {
            result[j] = number % i;
            number = number / i;
        }
        System.out.println("Введенное число " + n);
        System.out.println("Массив из цифр числа " + Arrays.toString(result));
    }
}

