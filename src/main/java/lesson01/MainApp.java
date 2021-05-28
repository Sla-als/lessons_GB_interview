package lesson01;

import lesson01.polymorphism.Circle;
import lesson01.polymorphism.Shape;
import lesson01.polymorphism.Square;
import lesson01.polymorphism.Triangle;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    // 1.Создать builder для класса Person со следующими полями:
    //  String firstName,
    //  String lastName,
    //  String middleName,
    //  String country,
    //  String address,
    //  String phone,
    //  int age,
    //  String gender.
    // 2.Описать ошибки в коде и предложить варианты оптимизации:
    // 3.Написать пример кода, который реализует принцип полиморфизма, на примере фигур — круг, квадрат, треугольник.

    public static void main(String[] args) {
        // 1
        Person person = new Person.Builder()
                .setFirstName("Adam")
                .setLastName("Smith")
                .setMiddleName("")
                .setCountry("England")
                .setAddress("123")
                .setPhone("123")
                .setAge(22)
                .setGender("M")
                .build();
        // 2 - в классе ErrorDescriptor
        // 3
        Circle circle = new Circle(3);
        Square square = new Square(10, 10);
        Triangle triangle = new Triangle(2, 4);

        List<Shape> shapeList = Arrays.asList(circle, square, triangle);

        for (Shape s : shapeList) {
            s.calculateArea();
        }
    }
}
