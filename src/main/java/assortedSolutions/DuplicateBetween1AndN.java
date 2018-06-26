package assortedSolutions;

import java.util.HashMap;
import java.util.Random;

public class DuplicateBetween1AndN {


    public static void main(String[] args) {
        Random rand = new Random();
        int[] ints = new int[1005];
        for(int i=0; i < 1001; i++) {
            ints[i] = rand.ints(1,100000).limit(10).findAny().getAsInt();
        }

        mergeSort(ints, 0, ints.length-1);

        System.out.println(findDuplicate(ints, 100));
        for(int i=0; i < 1000; i++) {
            System.out.println(ints[i]);
        }

    }

    public static Integer findDuplicate(int[] ints, int endRange) {
        Integer duplicateItem = null;

        HashMap<Integer, Integer> countOfOccurance = new HashMap<>();
        for(int item : ints) {
            if( !countOfOccurance.containsKey(item)) {
                countOfOccurance.put(item, 0);
            } else {
                return (Integer)item;
            }
        }

        System.out.println(0);
        return duplicateItem;
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
