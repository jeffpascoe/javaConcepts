package AssortedProblems;

import java.util.HashMap;

public class TallyProgram {

	public static void main(String[] args) {
		String input = "EbAAdbBEaBaaBBdAccbeebaec";
		TallyProgram tallyProgram = new TallyProgram();
		tallyProgram.tallyScore(input).entrySet().forEach(System.out::println);;
	}
	
	public HashMap<Character, Integer> tallyScore(String input) {
		char[] charArray = input.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		for( Character charArrayItem : charArray) {
			Character lowerChar = charArrayItem.toLowerCase(charArrayItem);
			if(!charMap.containsKey(lowerChar)) {
				charMap.put(lowerChar, 1);
			} else if(charArrayItem.isLowerCase(charArrayItem)) {
				charMap.replace(charArrayItem, charMap.get(charArrayItem)+1);
			} else {
				charMap.replace(lowerChar, charMap.get(lowerChar)-1);
			}
		}	
		return charMap;
	}
}
