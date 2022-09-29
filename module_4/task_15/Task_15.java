package part_2.module_4.task_15;

/*
Найти все натуральные n-значные числа, цифры в которых образуют строго
возрастающую последовательность (например, 1234, 5789).
Для решения задачи использовать декомпозицию.
 */
public class Task_15 {
    private int n;

    public static void main(String[] args) {
        Task_15 task15 = new Task_15();
        task15.setN(6);
        task15.result();
    }

    public void setN(int n) {
        if (n > 0 && n < 10) {
            this.n = n;
        } else {
            System.out.println("Количесвто цифр n должно быть больше 0 и меньше 10");
        }
    }

    //формирование 1 числа срого возрастающего начинающего с цифры start
    private int writeNumber(int start) {
        int number = 0;
        for (int i = start, j = n - 1; j >= 0; i++, j--) {
            number += (int) (i * Math.pow(10, j));
        }
        return number;
    }

    void result() {
        for (int i = 1; i < 10 - n + 1; i++) {
            System.out.print(writeNumber(i) + "  ");
        }
    }
}

