package basicJava;
import java.util.*;

public class myCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1 =0;
        double num2 =0;
        double result=0;  // variable needs to be declared
        char opt ;// wrong :char choice =scanner.nextCharacter();

        boolean isValid = true;

        System.out.print("Enter the num1: ");
        num1 =scanner.nextInt();
        scanner.nextLine();// to make buffer clear

        System.out.print("Enter the num2 : ");
        num2 =scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the choice: ");
        opt = scanner.next().charAt(0);
        switch(opt){
            case '+' ->  result =num1+ num2;
            case '-' -> result = num1-num2;
            case '*'-> result = num1*num2;
            case '/'-> result = num1/num2;
            case '%'-> result = num1%num2;
            default -> {
                System.out.println(" invalid operator");
                isValid = false;
            }
            }

            if (isValid){
                System.out.printf("%.2f %c %.2f = %.2f" , num1,opt,num2, result);
            }
        scanner.close();

        }

    }

