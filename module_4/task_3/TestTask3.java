package part_2.module_4.task_3;

/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */
public class TestTask3 {
    public static void main(String[] args) {
        Task_3 task3 = new Task_3();
        task3.setSide(15);
        System.out.printf("%.2f", task3.square());
    }
}
