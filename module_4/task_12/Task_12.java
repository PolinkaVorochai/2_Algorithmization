package part_2.module_4.task_12;

import java.util.Arrays;

/*
Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class Task_12 {
    private int k;
    private int n;
    private int sizeA;

    public static void main(String[] args) {
        Task_12 task12 = new Task_12();
        task12.setK(14);
        task12.setN(101248);
        task12.setSizeA(10);
        task12.result();
    }

    public void setSizeA(int sizeA) {
        if (sizeA >= 0) {
            this.sizeA = sizeA;
        } else {
            System.out.println("Размер массива А должен быть неотрицательным");
        }

    }

    public void setK(int k) {
        if (k > 0) {
            this.k = k;
        } else {
            System.out.println("Число k должно быть натуральным");
        }
    }

    public void setN(int n) {
        if (n > 0) {
            this.n = n;
        } else {
            System.out.println("Число n должно быть натуральным");
        }
    }

    private int summaNumber(int number) {
        int lengthNumber = (int) Math.log10(number) + 1;
        int summa = 0;
        int j = 10;
        for (int i = 0; i < lengthNumber; i++) {
            summa += number % j;
            number /= 10;
        }
        return summa;
    }

    void result() {
        int[] arrayA = new int[sizeA];
        for (int i = 0; i < arrayA.length; i++) {
            do {
                arrayA[i] = (int) (Math.random() * n);
            } while (summaNumber(arrayA[i]) != k);
        }
        System.out.println("Числа к и n: " + k + ", " + n);
        System.out.println("Массив A: " + Arrays.toString(arrayA));
    }
}

