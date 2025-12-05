package OOP.POLYMORPHISM;

public class Main {
    public static void main(String[] args) {

              // Poly - many
              // morphism - shape
              // objects can be identified as another objects(super classes)
              // Dog--> Animal

        //Vehicle v = new Vehicle();  --> abstract class cant be initialized
        Bike bike = new Bike();
        Car car = new Car();
        Boat boat = new Boat();


        bike.go();
        car.go();
        boat.go();
        System.out.println();

        // if you want to make above things as a array
        //  Car [] cars = {car, bike , boat}; means that here the bike and boat are not of Car data type .

        Vehicle[] vehicles = {car, bike, boat }; // here all the objects extends the vehicle superclass
                                                // they all belongs to vehicle class so we can make them a array

        for (Vehicle vehicle :vehicles){
            vehicle.go();
        }



    }
}
