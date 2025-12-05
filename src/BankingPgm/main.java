package BankingPgm;

import java.util.*;

public class main {
    static Scanner scanner = new Scanner(System.in);   // class variable

    public static void main(String[] args) throws InterruptedException {

        // JAVA BANKING PROGRAM

        double balance = 0;


        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("===> WELCOME TO YOUR BANK INFO <===");
            System.out.println("1 -> SHOW BALANCE  ");
            System.out.println("2 -> DEPOSIT  ");
            System.out.println("3 -> WITHDRAWAL  ");
            System.out.println("4 -> EXIT");


            System.out.print("Enter the Choice :");
            switch (scanner.nextInt()) {
                case 1 -> showBalance(balance);
                case 2 -> {
                    double d =deposit();
                    balance = balance + d;
                    System.out.printf("%.2f deposited\n", d);

                }
                case 3 -> {
                    double w =withdraw(balance);
                    balance = balance - w ;
                    System.out.printf("%.2f withdrawn \n", w);

                }
                case 4 -> {
                    System.out.println("Thank You ");
                    flag = false;
                } // not break , Why??
                default -> {
                    System.out.println("Choose Valid Option ");
                }
            }
            Thread.sleep(1000);
        }


    }

    static void showBalance(double balance) {
        System.out.printf("Your Bank Balance : %.2f \n", balance);


    }

    static double deposit() {   // all the processing should be done in the  method
        double deposit = 0;
        System.out.print("Enter Deposit amount: ");
        deposit = scanner.nextDouble();
        if (deposit<0){
            System.out.println(" Invalid ");
            return 0;
        }
        return deposit;


    }

    static double withdraw(double balance ) {
        double withdraw = 0;
        System.out.print("Enter the Withdrawal Amount: ");
        withdraw = scanner.nextDouble();
        if (withdraw<0){
            System.out.println("Invalid");
            return 0;
        }
        if (balance<withdraw){
            System.out.println("invalid");
            return 0;
        }

        return withdraw;


    }


}
