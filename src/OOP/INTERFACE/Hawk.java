package OOP.INTERFACE;

public class Hawk implements Predator {

    @Override       // means that the rabbit class will have its own method defination
    public void hunt() {
        System.out.println("Hawk is hunting");
    }
}
