package part_2.module_4.task_16;

/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме.
Для решения задачи использовать декомпозицию.
 */
public class Task_16 {
    private int n;

    public static void main(String[] args) {
        Task_16 task16 = new Task_16();
        task16.setN(2);
        task16.result();
    }

    public void setN(int n) {
        if (n > 0) {
            this.n = n;
        } else {
            System.out.println("Количесвто цифр n  в числе должно быть больше 0 ");
        }
    }

    //определение чколько четных цифр в числе
    private int numberEven(int number) {
        int count = 0;
        int j = 10;
        int lengthNumber = numberLength(number);
        for (int i = 0; i < lengthNumber; i++) {
            if ((number % j) % 2 == 0) {
                count += 1;
            }
            number /= 10;
        }
        return count;
    }

    //количество цифр в числе
    private int numberLength(int number) {
        return (int) Math.log10(number) + 1;
    }

    //отпределение длины массива, в котором будут все числа n-значные
    private int lengthArray() {
        int number1 = 0;
        int number2 = 0;
        for (int i = n - 1; i >= 0; i--) {
            number1 += (int) (9 * Math.pow(10, i));
        }
        for (int i = n - 2; i >= 0; i--) {
            number2 += (int) (9 * Math.pow(10, i));
        }
        return number1 - number2;
    }

    //првоерка чтобы число состояло только из нечетных цифр
    private boolean examNumber(int number) {
        boolean exam = false;
        int j = 10;
        for (int i = 0; i < n; i++) {
            if ((number % j) % 2 == 0) {
                break;
            } else {
                exam = true;
            }
            number /= 10;
        }
        return exam;
    }

    //заполнить массив всеми n-значными числами
    private int[] fullArray() {
        int[] array = new int[lengthArray()];
        int j = (int) Math.pow(10, n - 1);
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = j;
            System.out.print(array[i] + " ");
            j++;
        }
        return array;
    }

    //сумa n - значных чисел, содержащих только нечетные цифры
    void result() {
        int[] array = fullArray();
        int summa = 0;
        System.out.println("\n" + "Нечетные числа из массива: ");
        for (int i = 0; i < array.length; i++) {
            if (examNumber(array[i])) {
                System.out.print(array[i] + " ");
                summa += array[i];
            }
        }
        System.out.println("\n" + "Сумма  n - значных чисел, содержащих только нечетные цифры: " + summa);
        System.out.println("\n" + "Количетво четных цифр в числе " + summa + ": " + numberEven(summa));
    }
}
