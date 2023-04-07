package main.Misc.MultiThreading;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {

        /*
                MultiThreading = Process of executing multiple threads simultaneously
                                 Helps maximum utilization of CPU
                                 Threads are independent, they don't affect the execution of other threads
                                 An exception in one thread will not interrupt other threads
                                 useful for serving multiple clients, multiplayer games, or other mutually independent tasks
         */

        // create a subclass of thread
        MyThread thread1 = new MyThread();

        // or

        // implement Runnable interface and pass that instance as an argument to Thread()
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        //thread1.setDaemon(true);  main thread will still end if a demon thread is running
        //thread2.setDaemon(true);

        thread1.start();
        //thread1.join(/*delay*/); // calling thread (ex.main) will wait until the specified thread dies or for x amount of milliseconds.
        thread2.start();

        //System.out.println(1/0);
    }
}
