package methods;

public class methods {

    // methods ==> it is a block of reusable code , that is executed when it is called {()}  -- > calling
    public static void main(String[] args) {

        double result =add(1,2);

        System.out.println(result);
        boolean check = ageCheck(9);
        if (check) {
            System.out.println("Valid -> Adult");
        }
        else{
            System.out.println("you are not allowed to commit this action");
        }

    }
    /*
    ==>  create a method , outside the main method -> we can create a method
    ==>  a method can return something { int , string , boolean etc}.
     == >method should be descriptive , it should be named on what it does (optional).
    ==>  while creatig a mehtod , we need a return type ( ex : void , int etc) and a name to it and also parameters (optional)
    ==>  if you want use the method , then you need to call the methof in the main method.
    ==>  if we call our method from another static method, then the our method also need to be static.
    ==>   methods are  unfimilar(dont know) with variables declared in the other methods.
    ==> methods has parameters, method call -> arguments both must be same type names can be differnt.

    */

    static double add(int a , int b){
        return  a+b;  //  instead of creating third varible c , we can directly add them .
    }

    static boolean ageCheck(int age){
        return age>=18;
    }




}
