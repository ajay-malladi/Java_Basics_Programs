package ARRAYS;

import java.util.*;
public class userInputToArrays {

    static Scanner scanner = new Scanner(System.in); // for class variable :static

    public static void main(String[] args) {
        // Initialization of array with size from user and values

        String[] food ;
        int size;

        System.out.print("Enter the Size of Array: ");
        size= scanner.nextInt();
        scanner.nextLine();

        food = new String[size];


        System.out.println("Enter the Array elements : ");
        for (int i = 0; i < size; i++) {        // for indexing use only normal loop , dont use enhance for loop
            System.out.print("food[" + i + "] = ");
            food[i] = scanner.nextLine();  //
        }
        for (String item : food){  // here we can use item , it is just variable in a loop , but outside loop it has no identity.
            System.out.print(item+" ");
        }
      scanner.close();
    }

}
