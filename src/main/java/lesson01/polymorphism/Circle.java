package lesson01.polymorphism;

public class Circle extends Shape {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public int calculateArea() {
        return (int) (3.14 * r);
    }
}
