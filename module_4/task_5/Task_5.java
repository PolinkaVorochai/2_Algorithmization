package part_2.module_4.task_5;

/*
Составить программу, которая в массиве A[N] находит второе
по величине число (вывести на печать число, которое меньше
максимального элемента массива, но больше всех других элементов).
 */
class Task_5 {
    private int size;//размер массива

    //размер массива задать
    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Размер массива должен быть положительным числом");
        }
    }

    //вывод на экран массива массивов
    private void show(int[] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            System.out.printf("%3d\t", matrix[j]);
        }
    }

    //заполнить матрицу значениями
    private int[] fullMatrix() {
        int[] matrix = new int[size];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = (int) (Math.random() * 30);
        }
        return matrix;
    }

    //поиск максимума
    void findMax() {
        int[] matrix = fullMatrix();//заполнить матрицу
        int maxFirst = 0;//максимум
        int maxSecond = 0;//второе по велечине мксимальное число
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] > maxFirst) {
                maxFirst = matrix[i];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] > maxSecond && matrix[i] != maxFirst) {
                maxSecond = matrix[i];
            }
        }
        System.out.println("matrix : ");
        show(matrix);
        System.out.println();
        System.out.println("first max=" + maxFirst);
        System.out.println("second max=" + maxSecond);
    }
}
