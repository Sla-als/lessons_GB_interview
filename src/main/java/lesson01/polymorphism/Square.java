package lesson01.polymorphism;

public class Square extends Shape {
    int a;
    int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculateArea() {
        return a * b;
    }
}
