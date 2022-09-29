package part_2.module_4.task_1;

/*
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
НОК(А,В)=А*В/НОД(А,В)
 */
class Task_1 {
    int n;//первое натуральное число
    int m;//второе натуральное число

    //ввести первое число
    public void setN(int n) {
        if (n > 0) {
            this.n = n;
        } else {
            System.out.println("неверное число");
        }
    }

    //ввести второе число
    public void setM(int m) {
        if (m > 0) {
            this.m = m;
        } else {
            System.out.println("неверное число");
        }
    }

    //НОД
    int gcd() {
        int gcd = 1;
        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    //НОК
    int lcm() {
        int lcm = n * m / gcd();
        return lcm;
    }

}
