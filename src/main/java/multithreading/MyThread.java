package multithreading;

public class MyThread extends Thread {
    private int id;

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Running in " + this);
    }

    @Override
    public String toString() {
        return String.format("MyThread{id=%d} ", id);
    }


}
