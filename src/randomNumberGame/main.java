package randomNumberGame;
import java.util.*;

public class main {
    public static void main(String[] args) {

        // random number game
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // dont be dumb first think what your code requies.

        int max =100;
        int min =1;
        int count =0;
        int number =0 ;
        int randomNum =random.nextInt(min , max+1);

        int r1=0;
        int r2=0;
        //int[] val ={10,20,30,40,50};  //  first think for the logic
        //int[] rg={60,70,80,90,100};

        System.out.printf("Enter your guess:  %d - %d : ",min, max);
        do {
            //r1 =val[random.nextInt(val.length)];
            //r2 =rg[random.nextInt(rg.length)];
            number =scanner.nextInt();


            if (number != randomNum) {
             if (number -randomNum>0){
                System.out.println("TOO HIGH !! Try Again !!🤨");
            }
            else{
                System.out.println("TO LOW !! Try Again !!🤨");
            }
                System.out.println();

                System.out.print("Enter your guess again :");
            }
            count++;


        }while(number != randomNum);
        System.out.printf("Yaah you got it !! %d found !!\n", number);
        System.out.printf("%d Attemps ", count);





        scanner.close();




    }
}
/* instead of generating the random number , i have generated random index for range (r1, r2)
  it worked but the point here ,  i need to generate a game to guess a ronadom number with clues ,
  soo you should think whole idea once befor you start code

*/