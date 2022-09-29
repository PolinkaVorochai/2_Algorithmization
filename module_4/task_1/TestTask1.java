package part_2.module_4.task_1;

/*
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
НОК(А,В)=А*В/НОД(А,В)
 */
public class TestTask1 {
    public static void main(String[] args) {
        Task_1 task1 = new Task_1();
        task1.setN(100);
        task1.setM(300);
        System.out.println(task1.gcd());
        System.out.println(task1.lcm());
    }
}
