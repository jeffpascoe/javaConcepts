package AssortedProblems;

import java.util.ArrayList;
import java.util.Random;



public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Random rand = new Random();
		for(int i=0; i < 10; i++) { arr[i] = rand.nextInt(100); }
		
		mergeSort(arr, 0, arr.length-1);
	}
	
	public static void mergeSort(int[] arr, int startIndex, int endIndex) {
		if(startIndex <= endIndex) {
			int midIndex = (arr.length-1)/2;
			mergeSort(arr, startIndex, midIndex);
			mergeSort(arr, midIndex+1, endIndex);
				
			merge(arr, startIndex, midIndex, endIndex);
		}
	}
	
	public static void merge(int[] arr, int startIndex, int midIndex, int endIndex) {
		int leftSubSize = midIndex - startIndex -1;
		int rightSubSize = leftSubSize+1;
		int leftSubIndex = 0;
		int rightSubIndex = 0;
		int newSubArrayIndex = 0;
		
		int[] leftSubArray = new int[leftSubSize];
		int[] rightSubArray = new int[rightSubSize];
		
		for(int i = startIndex; i <= leftSubSize; i++ ) leftSubArray[i] = arr[i+1];
		for(int j = midIndex; j <= rightSubSize; j++) rightSubArray[j] = arr[midIndex + j+1];
		
		while(leftSubIndex < leftSubSize && rightSubIndex < rightSubIndex) {
			if(arr[leftSubIndex] <= arr[rightSubIndex]) {
				arr[newSubArrayIndex] = leftSubArray[leftSubIndex];
				leftSubIndex++;
			} else {
				arr[newSubArrayIndex] = rightSubArray[rightSubIndex];
				rightSubIndex++;
			}
			newSubArrayIndex++;
		}
		
		while(leftSubIndex < leftSubSize) {
			arr[newSubArrayIndex] = leftSubArray[leftSubIndex];
			leftSubIndex++;
			newSubArrayIndex++;
		}
		while(rightSubIndex < rightSubSize) {
			arr[newSubArrayIndex] = rightSubArray[rightSubIndex];
			rightSubIndex++;
			newSubArrayIndex++;
		}
	}
}
