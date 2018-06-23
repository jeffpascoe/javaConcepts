package streams;

import java.time.LocalDate;
import java.util.Random;

public class Person {
    Integer id;
    LocalDate birthDay;
    String generation;

    Random rand = new Random();

    public Person(LocalDate birthDay) {
        this.id = rand.nextInt();
        this.birthDay = birthDay;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
    public String getGeneration() {
        return generation;
    }
    public Boolean setGeneration(String generation) {
        this.generation = generation;
        return true;
    }

    @Override
    public String toString() {
        return this.getBirthDay().toString();
    }

}
