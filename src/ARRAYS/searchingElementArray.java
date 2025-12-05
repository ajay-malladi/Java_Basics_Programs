package ARRAYS;

import java.util.*;
public class searchingElementArray {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Searching  element in the Array

        String[] girl = {"cute", "angry", "innocent", "cunning"};
        System.out.print("Enter the kind of Girl: ");
        String find = scanner.nextLine();

        boolean isFound = false;

        for (int i =0; i< girl.length; i++){

            if (girl[i].equals(find)){  // for  strings we should use equals methods
                System.out.printf(" %s  girl found \n",girl[i]);
                isFound = true;
                break;

            }

        }

        if(!isFound){  // runs only if condition true
            System.out.println("Not found !!😢😢");
        }
        scanner.close();

    }
}

// we cant  compare , String 1 == String2 , because strings are reference data types , sout (String)=> gives us the address.
// "==" works for only primitive types , for primitive , jvm stores actual bit values where as for the reference kind , it stores the reference to the object.

