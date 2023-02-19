public class PizzaClass {

    //Создать метод calculateArea с параметром diameter (диаметр),
    // рассчитывающий и возвращающий площадь круга.
    static double calculateArea(double diameter) {

        double area = ((diameter * diameter) * Math.PI);
        return area;

    }

    //Создайте метод calculatePizzaCalories с параметрами diameter (диаметр)
    // и caloriesInSquareSm (кол-во калорий в квадратном сантиметре пиццы),
    // рассчитывающий количество калорий в пицце указанного диаметра.
    // Для расчета площади окружности метод calculatePizzaCalories должен
    // вызывать метод calculateArea.
    static double calculatePizzaCalories(double diameter, double caloriesInSquareSm) {
        return calculateArea(diameter) * caloriesInSquareSm;

    }

    public static void main(String[] args) {
        final int caloriesInSquareCm = 10;

        double caloriesIn20CmPizza = calculatePizzaCalories(20, caloriesInSquareCm);
        double caloriesIn25CmPizza = calculatePizzaCalories(25, caloriesInSquareCm);

        System.out.println("Разница в калориях между пиццей 20см и 25см: " + (caloriesIn20CmPizza + caloriesIn25CmPizza) + " калорий");


    }


}