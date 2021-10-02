package hrynkevych.serhii;

public class ReversNumber {
    static int revNumber = 0;

    public static void main(String[] args) {
        int number = 123;
        revers(number);
        System.out.println(revNumber);
    }

    private static void revers(int number) {
        if (number == 0) {
            return;
        } else {
            //System.out.print(number % 10);
            revNumber = revNumber * 10 + (number % 10);
            revers(number / 10);
        }
    }
}
