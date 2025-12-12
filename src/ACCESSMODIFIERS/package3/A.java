package ACCESSMODIFIERS.package3;

import ACCESSMODIFIERS.package4.*;  //all become available to use inside class A.

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.pubMessage);

        B b = new B();
        System.out.println(b.pubMessage2);
    }

}

//public modifier : with this modifier (class , variable , method)  can be accessed anywhere.
// two cases : 1 -- create the c instance in the all classes and all packages
//      case : 2 --create the b instance in the all classes and all packages

//Why do we need packages?
//To organize code
//To avoid name conflicts
//To control access between classes (via access modifiers)

//Importing only makes names available inside the file, NOT inside the whole package.
