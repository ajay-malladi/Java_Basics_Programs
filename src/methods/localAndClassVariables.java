package methods;

public class localAndClassVariables {

    static int x = 3; // class Variable : it is declared inside a class and can be accessed entire class

    public static void main(String[] args) {
        // Local Variables : these are method variables ,can be accessed in the respective methods.
        // Class Variables : Class Variables , these can used in every method , each method has a copy of the class variables.

        int x =1; //Local
        System.out.println("main "+ x);
        doSome();
        doIt();

    }
    static void doSome(){
        int x =2; //local , we can create variable with same name in the different methods
        System.out.println("doSome "+ x);
    }
    static void doIt(){
        System.out.println("doIt " +x); // this x is  class variable
    }
}

// the two  methods defined above ,can see class variable x at top.
// even though there is  class variable , java first uses local variable.