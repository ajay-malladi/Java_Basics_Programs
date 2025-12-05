package OOP.ABSTRACTION;


public class Triangle extends Shape {
    double base;
    double height;

    Triangle(double b, double h) {
        this.base = b;
        this.height = h;


    }

    @Override
    void round() {
        System.out.println("Shape is not Round");
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

}
