package basicJava;

public class breakAndContinue {
    public static void main(String[] args) {
        //break ==> breaks the loop at current iteration , comes out of loop. loop terminated(STOP)
        // continue ==> it skips the current iteration and  loop continues(SKIP)

        System.out.println("break");
        for (int i =0 ; i<5 ; i++){
            if (i ==3){
                break;

            }
            System.out.print(i+ " ");
        }
        System.out.println();

        System.out.println("Continue");
        for (int i =0 ; i<5 ; i++){
            if (i ==3){
                continue;

            }
            System.out.print(i+ " ");
        }
        System.out.println();

    }
}
