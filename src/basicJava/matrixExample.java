package basicJava;
import java.util.*;

public class matrixExample {
    public static void main(String[] args) {
        // matrice (n*n)

        Scanner scanner = new Scanner(System.in);
        int r;
        int c;
        char sym;


        System.out.print("Enter the Number of Rows: ");
        r=scanner.nextInt();
        System.out.print("Enter the Number of cols: ");
        c=scanner.nextInt();
        System.out.print("Enter the symbol : ");
        sym = scanner.next().charAt(0);

        char[][] arr = new char [r][c];


        for (int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                arr[i][j]=sym;
            }
        }


        System.out.println("Array :");
        for (int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }





    }

}
