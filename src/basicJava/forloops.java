package basicJava;

import java.util.concurrent.TimeUnit;

public class forloops {
    public static void main(String[] args) throws InterruptedException {
        // for loops , iterates for certain amount of times , syn : for (intialization ; conditon ; increment)
        // intialization -> for indexing  condtion -> validation to loop to run increment -> to update the values

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            Thread.sleep(1000);
        }
        System.out.println("I Love YOU❤️❤️❤️❤️");


    }
}
