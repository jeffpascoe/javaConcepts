package AssortedProblems;

public class AnagramChecker {

	public static void main(String[] args) {
		System.out.println(anagramChecker("Hello", "olleh"));

	}
	
	public static boolean anagramChecker(String sOne, String sTwo) {
		sOne = sOne.toLowerCase();
		sTwo = sTwo.toLowerCase();
		if(sOne.length() == sTwo.length()) {		
			for(char c : sOne.toCharArray()) {
				if(sTwo.lastIndexOf(c) == -1) {
					return false;
				}
			}
		}
			
		return true;
	}

}
