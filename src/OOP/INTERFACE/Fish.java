package OOP.INTERFACE;

public class Fish implements Prey, Predator {

    @Override      // means that the rabbit class will have its own method defination
    public void flee() {
        System.out.println("Fish is fleeing");
    }

    @Override      // means that the rabbit class will have its own method defination
    public void hunt() {
        System.out.println("Fish is Hunting ");
    }


}
