package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,3,4,2,23,54,65,34,2,43,56,664,443);
        List<Integer> singleDigitInts = ints.stream()
                .map(n -> n * 2)
                .filter(n -> n < 10)
                .collect(Collectors.toList());

        singleDigitInts.forEach(System.out::println);
    }
}
