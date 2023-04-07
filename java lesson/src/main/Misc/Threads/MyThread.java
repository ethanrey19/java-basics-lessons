package main.Misc.Threads;

public class MyThread extends Thread{

    @Override
    public void run() {

        if(this.isDaemon()){
            System.out.println("This is a DEMON thread");
        }else {
            System.out.println("This user thread is running");
        }
    }
}
