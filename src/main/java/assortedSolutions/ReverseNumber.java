package assortedSolutions;

public class ReverseNumber {

    public static void main(String[] args) {
         System.out.println(reverseInt(12345));
    }

    //I did not come up with this solution I copied it and rewrote it so that I could learn how it was done
    public static int reverseInt(int input) {
        long reversedNum = 0;
        long input_long = input;

        while (input_long != 0) {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;
        }
        return (int) reversedNum;
    }
}
