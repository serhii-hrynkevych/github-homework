package hrynkevych.serhii;

public class SumDigitsNumbers {
    static int sum;

    public static void main(String[] args) {
        int numbers = 11574;
        sum = countingSum(numbers);
        System.out.println(sum);
    }

    private static int countingSum(int numbers) {
        if (numbers == 0) {
            return sum;
        }  else {
            sum = sum + (numbers % 10);
            return countingSum(numbers / 10);
        }
    }
}
