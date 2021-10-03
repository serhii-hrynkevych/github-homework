package hrynkevych.serhii;

public class SumDigitsNumbers {

    public static void main(String[] args) {
        int numbers = 123;
        int sum = countingSum(numbers);
        System.out.println(sum);
    }

    private static int countingSum(int numbers) {
        if (numbers == 0) {
            return numbers;
        }  else {
            return (numbers % 10) + countingSum(numbers / 10);
        }
    }
}
