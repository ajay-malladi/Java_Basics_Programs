package ANNONYMOUS_CLASS;

public class main {
    public static void main(String[] args) {
        //Anonymous class :   These are the classes with no names ,
        //                   they  add the custoum behaviour of the object
        //                   after using them we cant recall them

        Dog normal = new Dog("funky");
        Dog Scooby = new Dog("scooby"){
            @Override
            void speak(){
                System.out.println("scooby making sound *hoo huh* *hoo huh * ");
            }

        };
        normal.speak();
        Scooby.speak();
    }
}
