package OOP.INHERITENCE.METHOD_OVERRIDING;

public class Main {
    // Method Overriding = when a subclass provides its owm  implementation of method
    //                       that is already defined
    //                       allows code reusability and specific method properties
    public static void main(String[] args) {

        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        Fish f = new Fish();


        d.move();
        c.move();
        f.move();




    }
}
