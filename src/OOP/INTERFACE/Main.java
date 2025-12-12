package OOP.INTERFACE;

public class Main {
    public static void main(String[] args) {

        // Interface = A blueprint for a class that specifies a set of abstract methods
        // that implementing classes must define.
        // multiple-inheritance behaviour

        // Interface = A rule book that tells a class what it MUST do,
        //but not HOW to do it.


        Fish fish = new Fish();
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();

        Prey rabbit1 = new Rabbit (); // polymorphism: You can refer to objects through abstract types:

        rabbit.flee(); //  rabbit.hunt(); -- it doesnt have that property , because it only have prey interface in it
        hawk.hunt();
        fish.flee();  // here fish has both the interfaces , the small fish will flee and big fish will hunt
        fish.hunt();   // hence the fish implements both the characters by implements both classes prey and predator

        // Prey p = new Prey();     Prey is a abstract method cant be initialized

    }
}
