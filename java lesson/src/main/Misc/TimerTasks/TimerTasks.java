package main.Misc.TimerTasks;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTasks {
    public static void main(String[] args) {

        // Timer =       A facility for threads to schedule tasks
        //               for future execution in a background thread

        // Timer task =  A task that can be scheduled for one-time
        //               or repeated execution by a Timer

        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask(){
            int counter = 10;
            @Override
            public void run() {
                if(counter>0){
                    System.out.println(counter);
                    counter--;
                }else{
                    System.out.println("Happy New Year");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2023);
        date.set(Calendar.MONDAY,Calendar.MARCH);
        date.set(Calendar.DAY_OF_MONTH,19);
        date.set(Calendar.HOUR_OF_DAY,19);
        date.set(Calendar.MINUTE,47);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);

        //timer.schedule(timerTask,3000); // executes after 3 seconds
        //timer.schedule(timerTask,date.getTime()); // executes at a certain date from Calendar
        //timer.scheduleAtFixedRate(timerTask,0 ,1000); // executes every 1 second
        timer.scheduleAtFixedRate(timerTask,date.getTime() ,1000); // executes every 1 second starting at a certain date
    }
}
