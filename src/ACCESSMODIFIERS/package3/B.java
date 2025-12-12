package ACCESSMODIFIERS.package3;

import ACCESSMODIFIERS.package4.*;

class B {   // no need to be public

    public String pubMessage2 = "This public variable with default class";

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.pubMessage);  // but the pubMessage variable must be public in order to be accessed
        System.out.println("hi");

        //public String pubMessage2= "This public variable with default class"; inside a method we can create public modifier


    }
}

// the current class need not to be a public ,it can defined anyway ,
