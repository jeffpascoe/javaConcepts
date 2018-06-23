package streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PersonStreamExample {
    static Random rand = new Random();

    public static void main(String[] args) {
        List<Person> people = createListOfPerson(100);

        List<Person> bornInFifties = people.stream()
                .filter(p -> p.getBirthDay().getYear() > 1950 && p.getBirthDay().getYear() < 1960)
                .collect(Collectors.toList());

        List<Person> bornInSixties = people.stream()
                .filter(p -> p.getBirthDay().getYear() > 1960 && p.getBirthDay().getYear() < 1970)
                .collect(Collectors.toList());

        bornInFifties.stream()
                .forEach(System.out::println);

        bornInSixties.stream()
                .forEach(System.out::println);
    }

    public static List<Person> createListOfPerson(int numOfPeopleToCreate) {
        List<Person> people = new ArrayList<>();
        for(int i=0; i < numOfPeopleToCreate; i++) {
            Integer birthYear = rand.ints(1940, 2015)
                    .findFirst()
                    .getAsInt();
            Integer birthMonth = rand.ints(1, 12)
                    .findFirst()
                    .getAsInt();
            Integer birthDay = rand.ints(1, 30)
                    .findFirst()
                    .getAsInt();
            people.add(new Person(LocalDate.of(birthYear, birthMonth, birthDay)));
        }

        return people;
    }
}
