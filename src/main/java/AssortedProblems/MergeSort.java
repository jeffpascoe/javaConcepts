package AssortedProblems;

import java.util.ArrayList;
import java.util.Collection;



public class MergeSort {

	public static void main(String[] args) {
		int[] intArray = new int[] { 1,6,7,8,2,3,4,5,8,9,4,5,109 };
		
		mergeSort(intArray, 0, intArray.length);
	}
	
	public static void mergeSort(int[] list, int lowIndex, int highIndex) {
		if(lowIndex == highIndex) {
			return;
		} else {
			System.out.println(lowIndex);
			System.out.println(highIndex);
			
			int midIndex = (lowIndex + highIndex)/2;
			mergeSort(list, lowIndex, midIndex);
			mergeSort(list, midIndex + 1, highIndex);
			System.out.println(lowIndex);
			System.out.println( midIndex + 1);
			System.out.println(lowIndex);
//			merge(list, lowIndex, midIndex + 1, highIndex);
		}
	}
	
//	public void merge(int[] list, int lowIndex, int midIndex, int highIndex) {
//		int
//	}
//	
	

}
