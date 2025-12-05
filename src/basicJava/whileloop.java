package basicJava;
import java.util.*;

public class whileloop {
    public static void main(String[] args) {
        // while loop : it is a condition based loop which is not terminated untill the conditon fails
        // similar to if , if loop checks condtion only once , but while untill condition is false.

        Scanner scanner = new Scanner (System.in);

        String name ="";

        System.out.println("Part one");
        while (name.isEmpty()){  // think check : while -> if
            System.out.print("Enter your Name: ");
            name =scanner.nextLine();  // scanner should always have a variable to store the data
            /*
                you need a condition inside your while to loop to end the loop otherwise
                you may end up in infinite loop
             */

        }
        System.out.printf("Hello %s\n",name);

        System.out.println("part 2");


        // =======>for getting a valid input from the user we can use while loop
        // exmaple : game ,enter q

        String ch = "";

        while (!ch.equals("Q")){
            System.out.print("Enter your key : ");
            ch = scanner.nextLine().toUpperCase();
        }
        System.out.println("You found the Key :"+ ch);

        //=============================================================================================
        System.out.println("part 3");
        // do while loop : basically it is a same to same while but it runs atleast once the condition

        int age =0;
        System.out.print("enter the age : ");
        age = scanner.nextInt();

        do{
            if (age>0){
                break;
            }
            System.out.println("Age can't be neagtive");
            System.out.print("Enter the Age : ");
            age = scanner.nextInt();
        }while (age <0);
        System.out.printf("age : %d",age);



        scanner.close();
    }
}
