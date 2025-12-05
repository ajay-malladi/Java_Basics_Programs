package methods;

public class overloadMethods {
    public static void main(String[] args) {

        // Overloaded methods = methods having the same name but different parameter
        // signature = name + parameters -> every method should have unique signature
        String order = pizzaType("roasted bread","coco" );
        System.out.println(order);
        String order1 = pizzaType("roasted bread" );
        System.out.println(order1);
    }

    static String pizzaType(String brname){
        return brname+ " pizza ";
    }

    static String pizzaType(String brname,String oil){
        return  oil+ " " + brname+" pizza ";
    }

}
