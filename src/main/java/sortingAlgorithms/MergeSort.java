package sortingAlgorithms;

import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[1001];
		Random rand = new Random();
		for(int i=0; i < 100; i++) { arr[i] = rand.nextInt(100); }
		
		mergeSort(arr, 0, arr.length-1);
	}

	public static void mergeSort( int[] list, int startIndex, int endIndex) {
		if( startIndex == endIndex)
			return;
		else {
			int midIndex = (startIndex + endIndex) / 2;
			mergeSort(list, startIndex, midIndex);
			mergeSort(list, midIndex + 1, endIndex);
			merge(list, startIndex, midIndex, endIndex);
		}
	}

	public static void merge(int[] list, int lowIndex, int midIndex, int highIndex) {
		int[] L = new int[midIndex - lowIndex + 2];

		for (int i = lowIndex; i <= midIndex; i++) {
			L[i - lowIndex] = list[i];
		}
		L[midIndex - lowIndex + 1] = Integer.MAX_VALUE;
		int[] R = new int[highIndex - midIndex + 1];

		for (int i = midIndex + 1; i <= highIndex; i++) {
			R[i - midIndex - 1] = list[i];
		}
		R[highIndex - midIndex] = Integer.MAX_VALUE;
		int i = 0, j = 0;

		for (int k = lowIndex; k <= highIndex; k++) {
			if (L[i] <= R[j]) {
				list[k] = L[i];
				i++;
			}
			else {
				list[k] = R[j];
				j++;
			}
		}
	}
}
