package assortedSolutions;

public class PalindromeIterative {

	public static void main(String[] args) {
		System.err.println(palindromeChecker("raceCar"));
	}
	
	public static boolean palindromeChecker(String inputString) {
		StringBuilder sb = new StringBuilder(inputString.toLowerCase());	
		
		if(inputString.toLowerCase().contentEquals(sb.reverse())) {
			return true;
		}
	
		return false;
	}

}
