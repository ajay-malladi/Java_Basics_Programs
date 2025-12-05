package OOP.GETTERS_SETTERS;

public class Main {

    //      Getters and Setters
    //  These are  used to protect the data and add the rules for accessing them
    //  Getters: it is a method that is readable
    //  Setter : it is a method that is writeable

    public static void main(String[] args) {


        Fan fan = new Fan(3,"voltas",40);
        Fan fan1= new Fan(3,"ram", 60);

        System.out.println(fan.getWings());
        System.out.println(fan.getName());
        System.out.println(fan.getPrize());
        System.out.println(fan.getMode());
        System.out.println();
        System.out.println("getters: ");
        fan.setMode("slow");
        fan.setPrize(500);
        System.out.println("");

        System.out.println("getters: fan1 ");
        fan.setMode("Turboo");
        fan.setPrize(700);





    }
}

// summary :
// coming to getters and setters , we use them to protect the object data and
// setting some rules to access them .
