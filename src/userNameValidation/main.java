package userNameValidation;
import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the user Name : ");
        String userName = scanner.nextLine();
        if (userName.length()<= 12 &&  userName.length()> 0 && !userName.contains(" ")){
            System.out.println("userName : "+userName);

        }
        else{
            System.out.println("Invalid userName ");
        }
        scanner.close();
    }
}

