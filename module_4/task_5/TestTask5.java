package part_2.module_4.task_5;

/*
Составить программу, которая в массиве A[N] находит второе
по величине число (вывести на печать число, которое меньше
максимального элемента массива, но больше всех других элементов).
 */
public class TestTask5 {
    public static void main(String[] args) {
        Task_5 task5 = new Task_5();
        task5.setSize(20);
        task5.findMax();
    }
}
