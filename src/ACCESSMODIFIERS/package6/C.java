package ACCESSMODIFIERS.package6;

import ACCESSMODIFIERS.package5.*;

//  Private access Modifier

public class C {
    private String prvMessage = "This is private Message";  // any access modifier variable should be at the declared globall
    private static int num = 3;

    public static void main(String[] args) {

        C c = new C();         //
        System.out.println(c.prvMessage);

        System.out.println(num);   // for a static variable accessing there is no need of creation of object


    }

}

//static = class level (no object needed)
//
//non-static = object level (must create object)