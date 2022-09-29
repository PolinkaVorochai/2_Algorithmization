package part_2.module_4.task_4;

import java.util.Arrays;

/*
На плоскости заданы своими координатами n точек. Написать метод(методы),
определяющие, между какими из пар точек самое большое расстояние.
Указание. Координаты точек занести в массив.
 */
class Task_4 {
    private int n;//количество точек

    //ввести количество точек
    public void setN(int n) {
        if (n > 0) {
            this.n = n;
        } else {
            System.out.println("Количество точек должно быть положительным числом");
        }
    }

    //вывод на экран массива массивов
    private void show(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d\t",matrix[i][j]);
            }
            System.out.println();
        }
    }

    //заполнить матрицу координатами
    private int[][] fullMatrix() {
        int[][] coordinate = new int[2][n];//матрица с координатами точек [x][y]
        for (int i = 0; i < coordinate.length; i++) {
            for (int j = 0; j < coordinate[i].length; j++) {
                coordinate[i][j] = (int) (Math.random() * 50);
            }
        }
        return coordinate;
    }

    //найти максимальное расстояние между точками
    void findMaxLength() {
        double distanceMax = 0;//максимальное расстояние (инициализация)
        int[] point1 = new int[2];//координаты 1 точки (инициализация)
        int[] point2 = new int[2];//координаты 2 точки (инициализация)
        int[][] coordinate = fullMatrix();//создать и заполнить матрицу
        for (int j = 0; j < (n - 1); j++) {
            for (int k = j + 1; k < n; k++) {
                double distance = Math.sqrt(Math.pow((coordinate[0][k] - coordinate[0][j]), 2) + Math.pow((coordinate[1][k] - coordinate[1][j]), 2));
                if (distance > distanceMax) {
                    distanceMax = distance;
                    point1 = new int[]{coordinate[0][j], coordinate[1][j]};
                    point2 = new int[]{coordinate[0][k], coordinate[1][k]};
                }
            }
        }
        System.out.println("matrix with coordinates: ");
        show(coordinate);
        System.out.println();
        System.out.printf("max distance=" + distanceMax + "\n");
        System.out.println("coordinate point 1=" + Arrays.toString(point1));
        System.out.println("coordinate point 2=" + Arrays.toString(point2));
    }
}
