package recursion;

import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		ArrayList<Integer> fibArray = new ArrayList<>();
		System.out.println(fib.generateFib(fibArray, 125));
	}
	
	public ArrayList<Integer> generateFib(ArrayList<Integer> fibArray, int terminalValue) {	
		if(fibArray.size() < 2) { fibArray.add(0); fibArray.add(1); }
		int currentArraySize = fibArray.size()-1;
		if(fibArray.get(currentArraySize) > terminalValue) return fibArray;
		else {
			int a = fibArray.get(currentArraySize);
			int b = fibArray.get(currentArraySize-1);
			fibArray.add(a+b);
		}
		return generateFib(fibArray, terminalValue);
	}

}
