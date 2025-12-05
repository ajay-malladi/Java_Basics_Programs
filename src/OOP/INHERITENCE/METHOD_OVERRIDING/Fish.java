package OOP.INHERITENCE.METHOD_OVERRIDING;

public class Fish extends Animal{

    @Override
    void move(){
        System.out.println("Animal is Swimming");
    }

}

  // with override , it warns if the method name is wrong , without it
  // if you  create  void moves(); by mistake then it create new mehtod .(reusabilitly is lost)