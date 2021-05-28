package lesson01.polymorphism;

public class Triangle extends Shape {
    int a;
    int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public int calculateArea() {
        return (int) (a * 0.5 * h);
    }
}
