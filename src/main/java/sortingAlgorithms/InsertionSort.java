package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		Double[] dubs = new Double[100];
		for (int i = 0; i < 100; i++) {
			dubs[i] = Math.random();
		}

		Arrays.stream(dubs).forEach(System.out::println);
		sort(dubs);
		Arrays.stream(dubs).forEach(System.out::println);
	}

	public static <T extends Comparable> T[] sort(T[] array) {
		T temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j > 0 ; j--) {
				if(array[j].compareTo(array[j-1]) < 0) {
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}

		return array;
	}
}