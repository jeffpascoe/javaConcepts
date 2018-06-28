package assortedSolutions;

public class SumOfDigits {

    public static void main(String[] args) {
        Integer input = 4656;
        System.out.println(sumOfDigits(input));
    }

    public static int sumOfDigits(Integer number) {
        int sum = 0;
        String strRepOfInt = number.toString();
        for(char ch : strRepOfInt.toCharArray()) {
            int convertedToInt = Integer.parseInt(String.valueOf(ch));
            sum += convertedToInt;
        }

        return sum;
    }

}
