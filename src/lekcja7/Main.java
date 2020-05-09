package lekcja7;

import lekcja7.figure.Circle;
import lekcja7.figure.Figure;
import lekcja7.figure.Rectangle;
import lekcja7.figure.Square;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski");
        Employee employee = new Employee("Paweł", "Nowak", 3200, 20, 20);
        Student student = new Student("Adam", "Nowakowski", 1000, 1000);

        printIncome(employee);
        printIncome(student);

        Figure square = new Square("Kwadrat mały", 3);
        Figure rectangle = new Rectangle("Rectangle", 3, 4);
        Figure circle = new Circle("Koło", 3);
        printArea(square);
        printArea(rectangle);
        printArea(circle);
    }

    private static void printArea(
            Figure figure
    ) {
        System.out.println(figure.getName());
        System.out.println(figure.getArea());
    }

    private static void printIncome(Profitable profitable) {
        System.out.println(profitable.getTotalIncome());
    }


}
