package EXCEPTIONS;
import java.util.*;
public class FileWriterDemo {
    public static void main(String[] args) {
        // Exception handling  : it is way to continue our code without interruption
        // try{} --> it implements the dangerous code , kind of code with exceptions
        // catch{} --> it catches the exceptions and prints a feedback to user about this error
        // finally{} ---> it actually runs no matter what at last it runs ,
        // by using try with resources java will close all the resource

        System.out.println("Lets learn Exception handling!!! ");


        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter the Number1 : ");
            int num1 =scanner.nextInt();
            System.out.print("Enter the Number2 : ");
            int num2 =scanner.nextInt();

            num1=(num1/(num2-1));
            System.out.println("out ; "+num1);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator cant be Zeroo🤨🤨🤨");
        }
          catch(InputMismatchException e){
              System.out.println("Check your data type !!!🧐🧐");
          }
          catch(Exception e){
              //System.out.println("Something went wrong");
          }
        finally{
            scanner.close();
        }
    }
}
