package AssortedProblems;

import java.util.Random;

public class BinarySearch {

	public static void main(String[] args) {
		int[] intArr = new int[100];
		Random rand = new Random();
		for(int i = 0; i < 99; i++) {
			intArr[i] = i;
		}
		System.err.println(binarySearch(intArr, 60));
	}
	
	private static boolean binarySearch(int[] intArr, int searchValue) {
		int halfSize = (intArr.length-1)/2;
		
		if(searchValue == intArr[halfSize]) {
			return true;
		} else if(searchValue < intArr[halfSize]) {
			int[] leftHalf = new int[halfSize];
			System.arraycopy(intArr, 0, leftHalf, 0, halfSize);
			return binarySearch(leftHalf, searchValue);
		} else if(searchValue > intArr[halfSize]) {
			int[] rightHalf = new int[halfSize];
			System.arraycopy(intArr, halfSize, rightHalf, 0, halfSize);
			return binarySearch(rightHalf, searchValue);
		}

		return false;
	}

}
