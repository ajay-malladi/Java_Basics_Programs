package HASHMAP;

import java.util.HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //HASHMAP : It is a data Structure that stores data in key-value pairs
        //           key --> unique ; value--> it can be duplicated
        //           it doesn't maintain any order, it is memory efficient .
        //            based on the hashcodes generated for key , it maps the data
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

//        String k;
//        int v;
//        System.out.print("Enter the number items : ");
//        int items = scanner.nextInt();
//        scanner.nextLine();  // for clearing the buffer
//        for (int i =0 ;i <items; i++){
//            System.out.print("Enter Key : ");
//            k = scanner.nextLine();
//            System.out.print("Enter Value : ");
//            v =scanner.nextInt();
//            scanner.nextLine();
//            map.put(k,v);
//        }

        map.put("apple",5);
        map.put("orange",6);
        map.put("mango",7);
        map.put("lemon",9);


        map.remove("lemon");  // key -- apple , orange ,...
        System.out.println(map);
        System.out.println(map.get("mango"));  // #only get#for getting the value
        System.out.println(map.containsKey("apple"));  // checking for key
        System.out.println(map.containsValue(2));   // checking for the value
        System.out.println(map.size());
        System.out.println();



        System.out.println("key ---> value");
        for (String key :map.keySet()){   // not get.keyset()  #wrong ,
            System.out.println(key+ " : "+ map.get(key)); // map.getValue(key)  #wrong

        }




      scanner.close();
    }
}
