package OOP.POLYMORPHISM_RUNTIME;
import java.util.*;

public class Main {

        //   RUNTIME POLYMORPHISM = When the method that executed is decided at the runtime based on the actual type of
      // object


    static Scanner scanner = new Scanner (System.in);   //  should be static otherwise the main method cant see it
    public static void main(String[] args) {
        Lion lion = new Lion();
       Animal tiger = new Tiger(); // it is object creation using the super class object


        Animal runtimeAni;


        System.out.println("1. Lion");
        System.out.println("2. Tiger");
        System.out.print("Enter the Choice : ");
        int choice = scanner.nextInt();

        switch(choice){      // at runtime the animal is type is defined .
            case 1 -> {
                runtimeAni= new Lion();
                runtimeAni.sound();

            }
            case 2->{
                runtimeAni= new Tiger();
                runtimeAni.sound();
            }

        }


        scanner.close();
    }
}
