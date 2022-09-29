package part_2.module_4.task_2;

/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class TestTask2 {
    public static void main(String[] args) {
        Task_2 task2 = new Task_2();
        task2.setA(30);
        task2.setB(250);
        task2.setC(20);
        task2.setD(10);
        System.out.println(task2.gcd());
    }
}
