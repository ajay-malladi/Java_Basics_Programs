
package basicJava;
import java.util.*;


public class userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product : ");
        String product = scanner.nextLine();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.println();
        System.out.println("You purchased "+ quantity+" " +product +" it costs "+25*quantity  +"👍");



        scanner.close();


    }

    

}
