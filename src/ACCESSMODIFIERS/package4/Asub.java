package ACCESSMODIFIERS.package4;
import ACCESSMODIFIERS.package3.*;

public class Asub extends A  {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.pubMessage);

        //B b = new B();   we cant create instance of a default class in different package.

    }
}
