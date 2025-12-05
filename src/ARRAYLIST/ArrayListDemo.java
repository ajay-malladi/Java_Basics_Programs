package ARRAYLIST;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList : it is a resizable array that can store objects(for primitive types -Autoboxig is done)
        //              arrays(fixed size ) , ArrayList (variable size)

        // let us see few useful properties of ArrayList

        Scanner scanner = new Scanner(System.in);
        int count =0 ;
        boolean flag = true;

        ArrayList<Integer> list = new ArrayList<>();  // no  need to mention the size , should use wrapper classes for primitivetype
        System.out.print("Enter no of elements you want to store: ");// ArrayList only stores objects
        int stop=scanner.nextInt();
        scanner.nextLine();
        while(flag){
            System.out.print("Enter the Element : ");
            list.add(scanner.nextInt());           //.get()  -- property used to add the elements to tha AL.
            count++;
            if(count == stop){
                flag =false;
            }
        }
        System.out.println(list);    // printing all the elements

        list.remove(2);        // .remove(index); removes at a certain index {0,1,2,3  .... nth index}
        System.out.println(list);

        list.set(2,3);              // .set(index,value); it adds the value at a certain index
        System.out.println(list);

        System.out.println(list.get(0));                // .get(index)  ; it is used to get a value at a certain index.

        System.out.println(list.size() );             // .size();   it gives the size of list

        Collections.sort(list);   //  property from the collection framework



    }
}
