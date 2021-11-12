package hrynkevych.serhii;

public class FindMaxValue {

    public static void main(String[] args) {
        int[] array = {1, 2, 10, 2, 9};
        int max = findMax(array, 0);
        System.out.println(max);
    }

    private static int findMax(int[] array, int i) {
        if (array.length > i) {
            int next = findMax(array, i + 1);
            return Math.max(array[i], next);
        } else {
            return array[0];
        }
    }
}
