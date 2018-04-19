package AssortedProblems;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.err.println(primeChecker(98456789) ? "yes" : "no" );
	}

	public static boolean primeChecker(int num) {
		for(int index = 2; index < num; index++) {
			if(num % index == 0) {
				return false;
			}
		}
		
		return true;
	}
}
