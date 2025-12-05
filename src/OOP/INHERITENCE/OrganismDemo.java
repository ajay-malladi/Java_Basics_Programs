package OOP.INHERITENCE;

public class OrganismDemo {
    public static void main(String[] args) {
        System.out.println("Hello welcome to world of organism");
        Organism o1 = new Organism();
        Animal a =new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        Plant p = new Plant();

        System.out.println();
        o1.isAlive();         // if you want to call the function from class without object make it a static method
        a.smell();              //      and call in main class Class.method();
        d.smell();              //    else no static , object .method()
        c.smell();  //  if the cat class doest have the smell  method it inherit it form animal class.
        p.isAlive();
        p.photosynthesis();
        d.speak();

    }

}
