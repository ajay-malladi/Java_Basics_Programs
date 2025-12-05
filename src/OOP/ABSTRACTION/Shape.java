package OOP.ABSTRACTION;

public abstract class Shape {    // it is a abstract class , no object is created through this class

    String colour;

    Shape() {
        this.colour = "black";

//        void round () {                   // defining a method in the constructor is not allowed
//            System.out.println("Shape is Round");
    }

    void round() {
        System.out.println("Shape is Round");
    }


    abstract double area();   // this is a abstract method   , it cant have code in abstract method , childs must have the
    // implementation

    void showShape() {                 // concrete class : it will be inherited to the child classes
        System.out.println("It is a shape");
    }
}
