package OOP.TOSTRING;

public class Cardemo {
    public static void main(String[] args) {

        // .toString() = it is inherited method form the object class.
        //               used to return a string representation of an object.
        //                by default, it return a hascode  as a unique identifier
        //                It can be overriden to provide meaningful details

        Car car1 = new Car("BNW" , "black");
        Car car2= new Car("Mercedes" , "black");

        System.out.println(car1);
        System.out.println(car2);


    }
}

// basically it is used to print the object details by the object itself , no need to access the properties
//using override we define a toString method which return all the meaningful data of the object
