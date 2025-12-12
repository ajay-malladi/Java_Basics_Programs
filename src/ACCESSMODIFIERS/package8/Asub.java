package ACCESSMODIFIERS.package8;

import ACCESSMODIFIERS.package7.*;

public class Asub extends A {
    public static void main(String[] args) {
        Asub asub = new Asub();
        System.out.println(asub.prcMessage);
    }
}
// Doesnt work for A a = new A (); WHY?

//Accessible in subclasses, even if they are in different packages —
// BUT only through the subclass instance, not through a base class instance.