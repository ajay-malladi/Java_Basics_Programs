package methods;

public class overloadMethods {
    public static void main(String[] args) {

        // Overloaded methods = methods having the same name but different parameter
        // signature = name + parameters -> every method should have unique signature
        String order = pizzaType("roasted bread", "coco");
        System.out.println(order);

        String order1 = pizzaType("roasted bread");
        System.out.println(order1);

        int cost = pizzaType(5);   // The methods can be overloaded with different returnTypes
        System.out.println("Cost of pizza " + cost);

    }

    static int pizzaType(int number) {
        int mul = 3;
        return number * mul;
    }


    static String pizzaType(String brname) {
        return brname + " pizza ";
    }

    static String pizzaType(String brname, String oil) {
        return oil + " " + brname + " pizza ";
    }


}

//Summary:
// Method overload can have different return datatypes
// above pizzaType method returns string in two cases and int in one case.





