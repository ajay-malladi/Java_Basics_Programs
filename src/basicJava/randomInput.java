package basicJava;
import java.util.*;

public class randomInput {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        double num;
        boolean isTrue;
        number =random.nextInt(1,10);  // The range is between 1 and 6.
        num = random.nextDouble(1,3);
        isTrue = random.nextBoolean();
        int[] val ={1,4,6,8};
        int nms =val[random.nextInt(val.length)];

        System.out.println("The number is "+ number);
        System.out.println("The Decimal Number is "+ num);
        System.out.println("The Boolean : "+ isTrue);
        System.out.println("nms: "+ nms);

    }





}
