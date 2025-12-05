package basicJava;
import java.util.*;
public class enhancedSwitch {
    public static void main(String[] args) {

        //enhanced switch

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter Choice :");
        int num = scanner.nextInt();
        scanner.nextLine();  // clear buffer
        switch(num){
            case 6 ->System.out.println("friday");
            case 2 ->System.out.println("Monyay");
            case 3 ->System.out.println("Tuedyay");
            case 4 ->System.out.println("Wednesday");
            case 5 -> System.out.println("thursday");
            case 1,7 -> System.out.println(" Its weekend");


        }

    }
}
