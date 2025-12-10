import java.util.Timer;
import java.util.TimerTask;

public class TimerTasks {

    public static void main(String[] args){

        // timer = class that schedules tasks at specific times or periodically
        //         useful for: sending notifications, scheduled updates, repetitive actions

        // TimerTask = represents the task that will be executed by the Timer
        //             you will extend the TimerTask class to define your task
        //             create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int count = 3;

            @Override
            public void run() {
                count--;
                System.out.println("Hello");
                if(count <= 0){
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 3000);
    }
}
