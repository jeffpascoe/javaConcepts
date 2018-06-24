package multithreading;

import java.util.Random;

public class MyRunnable implements Runnable {
    private Integer id;
    Random rand = new Random();

    public MyRunnable() {
       this.id = rand.ints(1,100000000)
               .findAny()
               .getAsInt();
    }
    @Override
    public void run() {
        System.out.println("Created thread with id: "+this.id+"\n at time: "+ System.currentTimeMillis());
    }
}
