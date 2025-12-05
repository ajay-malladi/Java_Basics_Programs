package TIMER_TIMERTASK;

import java.util.Timer;
import java.util.TimerTask;
import java.util.*;

public class TimerTaskdemo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Timer timer = new Timer();




        TimerTask task = new TimerTask() {// abstract class so , need to write code in the child class instead
            @Override
            public void run() {

                boolean flag = true;
                System.out.println("Enter the where the count starts : ");

                int count = 5;
                while (flag) {

                    if (count == 0) {
                        System.out.println("HAPPY NEW YEAR");
                        timer.cancel();    // need to close the  timer
                        flag = false;
                    }
                    System.out.println(count);
                     count--;

                }


            }

        };
        timer.schedule(task, 0, 10);   //(task , delay , period)


        scanner.close();

    }
}
