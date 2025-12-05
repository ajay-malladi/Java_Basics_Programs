package OOP.INHERITENCE;

public class Animal extends Organism{

    void isAnimal(){
        System.out.println(" It's a  animal");
    }
    void smell(){          // needs to be static to be access using animal class
        System.out.println("Animal is smelling ");
    }



}
