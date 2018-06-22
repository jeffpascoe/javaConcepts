package multithreading;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //MyThread thread = new MyThread();
        List<MyThread> threads = Stream.iterate(0, n -> n + 1)
                .map(MyThread::new)
                .limit(10)
                .collect(Collectors.toList());

        threads.forEach(MyThread::start);
    }
}
