package hrynkevych.serhii;

public class ReversNumber {

    public static void main(String[] args) {
        int number = 574;
        int revNumber = revers(number, 0);
        System.out.println(revNumber);
    }

    private static int revers(int number, int reversNumber) {
        if (number == 0) {
            return reversNumber;
        }  else {
            int digit = number % 10;
            reversNumber = reversNumber * 10 + digit;
            return revers(number / 10, reversNumber);
        }
    }
}
