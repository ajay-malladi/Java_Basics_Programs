package OOP.ABSTRACTION;

public class Rectangle extends Shape {

    double l;
    double b;


    Rectangle(double len, double bre) {
        this.l = len;
        this.b = bre;

//        @Override
//         void round(){
//            System.out.println("Shape is not Round");
//        }
    }

    @Override
    double area() {
        return l * b;
    }

    @Override
    void round() {
        System.out.println("Shape is not Round");
    }


}
