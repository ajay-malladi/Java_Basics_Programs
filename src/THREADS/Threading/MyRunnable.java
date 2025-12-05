package THREADS.Threading;

public class MyRunnable implements Runnable {   // Runnable is a functional interface (have a look on it)
    String text;

    MyRunnable(String text) {
        this.text = text;

    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {

            try {

                Thread.sleep(1000);   // this is Thread class (built in class
                System.out.println(text);
            } catch (java.lang.InterruptedException e) {
                System.out.println("Some Thing went wrong !!");

            }

            if (i == 10) {
                System.out.println("Time is over");
                System.exit(0);   // it will exit the program with code 0
            }
        }


    }

}
