package OOP.ABSTRACTION;

public class main {

    // abstract = it is a keyword used to define abstract class and method
    //             shows the ensential information but hides the internal implementation
    //             abstract classes can't be initiated directly
    //             can contain the abstract methods (which must be implemented .
    //             can contain concrete methods (which must be inherited

    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(2,3);
        Triangle t = new Triangle(1,4);

        System.out.println("Circle r :: "+ c.radius+ " Area: " + c.area());  // not Circle  , stactic --> class otherwise should call through objects
        System.out.println("Triangle b and h ::"+ t.base+ "  "+t.height +"  Area: " + t.area());
        c.showShape();
        t.showShape();
        System.out.println(r.colour);  // Not Rectangle.   ---> if variable is not static then dont use Class
        r.round();
        c.round();
        t.round();

    }
}

// summary;
//basically , abstraction provide us the security by hiding the internal
// implementation and show essential features
//the abstract methods cant have the code here ,
// it is compulsory to have implementation in the child classes
// the concrete classes are inherited to the child class
// it is  50 % code like some  instance variables and instance methods are inherited to child class