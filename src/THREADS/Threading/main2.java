package THREADS.Threading;


public class main2 {
    public static void main(String[] args) {
        //MULTITHREADING :  it enables to run mutiple threads concurrently.
        //                  a thread is set of instructions that runs independently
        //                  mthreading , it is useful for background task  or any time comsuming task

        MyRunnable runn = new MyRunnable("ping");
        MyRunnable runn1 = new MyRunnable("pong");
        System.out.println("GAME STARTS");




        Thread thread1 = new Thread(runn);
        Thread thread2 = new Thread(runn1);

        thread1.setDaemon(true);
        thread1.setDaemon(true);

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("SomeThing went Wrong");
        }
        System.out.println("GAME ENDS");


    }
}
