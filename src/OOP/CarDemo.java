package OOP;
// object->Car (both classes linked)

/*                      ==>OBJECT<==
       object : it is an entity that HOLDS DATA(ATTRIBUTES)
       and can perform actions (methods)
       object is a REFERENCE DATA TYPE ,   */


public class CarDemo {
    static Car car = new Car();// instance varibale: it belongs to all methods ,when ever we use the any in

    public static void main(String[] args) {

        System.out.println(car.make);  // dot operator is used to access the object attributes.
        System.out.println(car.isRunning);
        car.CarCondition();
        car.breaking();
        car.CarCondition();
        car.Start();
        car.CarCondition();
        car.Horn();




    }






}
