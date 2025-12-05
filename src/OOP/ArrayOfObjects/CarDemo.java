package OOP.ArrayOfObjects;

import java.util.*;


public class CarDemo {
    //  Array of Object , Creation and initialization

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Car[] cars = new Car[3];  // Car(dataType) [] Arrayname = new datatype[Size];
        String name;
        String colour;
        System.out.println("Fill Car Data ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + (i + 1) + " :");
            System.out.print("Car Name : ");
            name = scanner.nextLine();
            System.out.print("Car colour : ");
            colour = scanner.nextLine();

            cars[i] = new Car(name, colour);
        }
        for (Car c : cars) {
            System.out.printf("%s Car with %s Color 🚗\n", c.name, c.colour);
        }


        /*//second method:
        //----car objects initialised--
        Car car1 = new Car("BNW", "Black");
        Car car2 = new Car("Mercedes", "Black");

        //---assigning to Car Array---
        Car[] cars ={ car1 , car2 }   ;

         */



        /*
            third method :

            Car[] cars ={new Car("BNW", "Black"),Car car2 = new Car("Mercedes", "Black");}



            */


    }
}
