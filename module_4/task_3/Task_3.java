package part_2.module_4.task_3;

/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */
class Task_3 {
    double side;//сторона

    //ввести значение стороны
    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            System.out.println("Сторона должна быть положительной");
        }
    }
//посчитать площадь
    double square() {
        double square = (Math.pow(side, 2) * Math.sqrt(3) / 4)*6;
        return square;
    }
}
