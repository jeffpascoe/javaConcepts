package Lambdas;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;


public class Lambdas {

	public static void main(String[] args) {
		ArrayList<Integer> intList = createListOfInts();
		intList.forEach(System.out::println);
		System.err.println("********************Filtered Integers***********************");
		removeIntsGreaterThan100(intList).forEach(System.out::println);
	}

	public static ArrayList<Integer> createListOfInts() {
		Random random = new Random();
		ArrayList<Integer> intList = new ArrayList<>();
		int randomNumber = random.nextInt(25);
		for(int i=0; i< randomNumber; i++) {
			intList.add(random.nextInt(1500));
		}
		return intList;
	}
	
	public static ArrayList<Integer> removeIntsGreaterThan100(ArrayList<Integer> intList) {
		return (ArrayList<Integer>) intList
				.stream()
				.filter(x -> {
					return x < 100;})
				.collect(Collectors.toList());
	}
}
