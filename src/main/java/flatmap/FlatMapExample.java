package flatmap;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlatMapExample {

    private static Map<Integer, ArrayList<Double>> mapList;

    public static void main(String[] args) {
        fillMapList(25);
        System.out.println(mapList.size());

        mapList.values()
                .stream()
                .flatMap(randList -> randList.stream())
                .map(BigDecimal::new)
                .map(bigD -> bigD.setScale(2, 2))
                .sorted()
                .forEach(System.out::println);

    }

    private static void fillMapList(int size) {
        mapList = new HashMap<>();

        for (int i = 0; i < size; i++) {
            mapList.put(i, new ArrayList<Double>());
            for (int j = 0; j < 10; j++) {
                mapList.get(i).add(Math.random());
            }
        }

    }
}
