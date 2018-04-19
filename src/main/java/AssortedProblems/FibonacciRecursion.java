package AssortedProblems;

import java.util.ArrayList;

public class FibonacciRecursion {

	public static void main(String[] args) {
		ArrayList<Integer> fibSequence = fibonacciUpToN(9, new ArrayList<Integer>());
		
		fibSequence.stream().forEach(System.out::println);	
	}

	public static ArrayList<Integer> fibonacciUpToN(int max, ArrayList<Integer> sequence) {
		
		if(sequence.size() < 1) {
			sequence.add(1);
			sequence.add(1);
		}
		if(sequence.get(sequence.size()-1) > max) {
			sequence.remove(sequence.size()-1);
			return sequence;
		} else if(sequence.get(sequence.size()-1) == max) {
			
			return sequence;
		}		
		
		sequence.add(sequence.get(sequence.size()-2) + sequence.get(sequence.size()-1));
		return fibonacciUpToN(max, sequence);
	}
}

