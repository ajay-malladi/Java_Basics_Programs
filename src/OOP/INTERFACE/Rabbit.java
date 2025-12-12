package OOP.INTERFACE;

public class Rabbit implements Prey {

    @Override                  // means that the rabbit class will have its own method defination
    public void flee() {       // for method implemented by it through interface.
        System.out.println("Rabbit is fleeing ");
    }
}
