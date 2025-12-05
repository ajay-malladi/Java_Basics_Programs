package QuizGame2dArr;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score=0;
        int guess;

        String [][] quiz ={{"Who is Iron Man🧐 ??","1. pet","2. Tony Stark ","3. Ajay","4. raju"},
                            {"Who is Spider Man🕸️🕸️🧐??","1. Ajay","2.mark zuckerberg","3. Peter Parker","4.virat"},
                            {"Who is Sydeny Sweeny😒😒??" ,"1.Your Wife", "2.Your Girlfriend", "3. Actress","4. rugby player"}  };

        int[] ans = {2,3,3};


        for (int i = 0; i<quiz.length; i++){
            System.out.println();
            System.out.println("/////     Quiz      //////");
            for (int j =0; j<quiz[0].length ;j++){
                System.out.println(quiz[i][j]);

            }
            System.out.print("Enter the guess: ");
            guess= scanner.nextInt();
            if (guess ==ans[i] ){
                score++;
            }
        }
        System.out.printf("Your Score : %d", score);





    }


}
