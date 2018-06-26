package assortedSolutions;

import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[15];
		for(int i=0; i<14; i++) {
			arr[i] = rand.nextInt(100);
			System.err.println(arr[i]);
		}
		
		quickSort(arr, 0, arr.length-1);
		
		for(int i=0; i<13; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pivot = partition(arr, low, high);
			//before pivot
			quickSort(arr, low, high);
			//after pi
			quickSort(arr, pivot+1,high );
		}	
	}
	
	public static int partition(int[] arr, int leftIndex, int rightIndex) {
		int pivot = (arr.length - 1)/2;
		while(leftIndex < pivot) {
			while(arr[leftIndex] < arr[pivot]) leftIndex++;
			while(arr[rightIndex] > arr[pivot]) rightIndex--;
			if(arr[leftIndex] <= arr[rightIndex]) {
				int temp = arr[leftIndex];
				arr[leftIndex] = arr[rightIndex];
				arr[rightIndex] = temp;
				leftIndex++;
				rightIndex--;
			} 
		}
		
		int swapTemp = arr[leftIndex+1];
		arr[leftIndex+1] = arr[rightIndex];
		arr[rightIndex] = swapTemp;
		return leftIndex+1;
	}
	
	

}
