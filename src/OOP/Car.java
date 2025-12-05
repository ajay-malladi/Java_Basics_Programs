package OOP;
// object->Car (both classes linked)

public class Car {
    String make ="BNW";
    String model= "BMW i5";
    int year = 2025;
    double price = 99999.99;
    boolean isRunning=true;

    void breaking(){          // The method should be inside the class , no outside Why??
        System.out.println("Car Stopped!!");
        isRunning=false;
    }
    void Start(){
        System.out.println("Car Started 🚗🚗");
        isRunning =true;
    }
    void CarCondition(){
        if (isRunning){
            System.out.println("Car is running 🚗🚗🚗");}
        else{
            System.out.println("Car Stopped!!🧐🧐🧐");
        }
    }
    void Horn(){
        System.out.println("Horn📯📯");
    }


}


