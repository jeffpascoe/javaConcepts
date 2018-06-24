package multithreading;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //Creating threads by extending the Thread class

        List<MyThread> threads = Stream.iterate(0, n -> n + 1)
                .map(MyThread::new)
                .limit(10)
                .collect(Collectors.toList());

        threads.forEach(MyThread::start);

        //Creating threads by passing a class into thread that implements the Runnable interface
        for(int i=0; i < 10; i++) {
            new Thread(new MyRunnable()).start();
        }

    }
}
