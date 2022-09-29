package part_2.module_4.task_8;

/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
 */
public class Task_8 {
    int sizeArray;

    public static void main(String[] args) {
        Task_8 task8 = new Task_8();
        task8.setSizeArray(20);//размер массива задается
        task8.summaThreeNumbers(4, 8);//результат (c 4 позиции по 8)
    }

    //ввести размер массива
    public void setSizeArray(int sizeArray) {
        if (sizeArray > 0) {
            this.sizeArray = sizeArray;
        } else {
            System.out.println("Размер массива должен быть положительным числом");
        }
    }

    //заполнить массив
    private int[] fullMatrix() {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        return array;
    }

    //вывести на экран 3 последовательных числа массива и их сумму
    public void summaThreeNumbers(int k, int m) {
        int summa = 0;
        int[] array = fullMatrix();
        show(array);
        if (k > 0 && m > 0 && k < (sizeArray - 3) && m < (sizeArray - 3) && k < m) {
            int numberK = k;
            int numberM = m;
            System.out.println("\n result: ");
            for (int j = k; j < m; j++) {
                for (int i = j; i < (j + 3); i++) {
                    summa += array[i];
                    System.out.printf("%3d\t", array[i]);
                }
                System.out.println("\n summa " + summa);
                summa = 0;
            }
        }
    }


    //вывод на экран массива
    private void show(int[] matrix) {
        System.out.println("Array: ");
        for (int j = 0; j < matrix.length; j++) {
            System.out.printf("%3d\t", matrix[j]);
        }
    }
}
