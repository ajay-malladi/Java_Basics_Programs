package ARRAYS;

import java.util.*;

public class basicOperationsArrays {
    public static void main(String[] args) {
        //Array : it is a collection of values of the same datatype , values are contiguous

        String[] fruits = {"apple", "banana", "coconuts", "orange"};
        // accessing each element in array , syn : arr[i].
        System.out.println(fruits[0]);
        // arrays modified similar to variables (not immutable)
        fruits[0]="guava";
        System.out.println(fruits[0]);

        //length of array syn: arr.length;
        int len = fruits.length;  //length is a variable inside the array class, where the size of array is assigned to it , so it not a method.
        System.out.printf("length of the array : %d \n",len);

        // enhanced for loop
        for (String fruit : fruits){
            System.out.print(fruit +" ");
        }
        System.out.println();

        // built in sort method
        Arrays.sort(fruits);
        for (String fruit : fruits){
            System.out.print(fruit +" ");
        }
        System.out.println();

        // fill : assign all values with same data
        Arrays.fill(fruits,"❤️");  // syn : Arrays.fill(arr,data);
        for (String fruit : fruits){
            System.out.print(fruit +" ");
        }



    }
}
