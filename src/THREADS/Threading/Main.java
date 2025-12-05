//package THREADS.Threading;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        MyRunnable runn = new MyRunnable(hi);
//        Thread thread = new Thread(runn); // Thread --> built in class
//        // without calling the object , or through method , using thread (task)
//
//        /*     Here is a new employee (Thread).
//               His job is described by runnable.run().
//                When I call thread.start(), he will begin working.*/
//
//        Scanner scanner = new Scanner(System.in);
//
//        thread.setDaemon(true);  // why not below the start ??  error??
//        // setDaemon(true) →Make this thread a background helper.JVM will not wait for it when main thread ends.
//        //  Must be called before start().
//
//        thread.start();  //creates the 10sec delay
//
//
//        System.out.println("you are time is 10 sec to enter your Name :");
//        String name = scanner.nextLine();
//        System.out.println("hello " + name);
//
//
//    }
//}

// summary:
// here we have created a Myrunnable class , using interface we implements runnable ( a functional class)
// after creating the runnale object of class Myrunnable , we have given it to thread to implement it
// without any object call , method. thread runs the runnable .

// MyRunnable : :It is just a task (a class with a run() method).
//A Thread is a thread---->It is the actual lightweight process that can run in parallel.