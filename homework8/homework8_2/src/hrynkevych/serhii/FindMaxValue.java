package hrynkevych.serhii;

public class FindMaxValue {
    static int max = 0;

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 2, 9}; //задаю массив, где сумма элементов = 15
        max = findMax(array, 0);
        System.out.println(max);
    }

    private static int findMax(int[] array, int i) {
        if (i == array.length) {
            return max;
        }
        if (array[i] > max) {
            max = array[i];
            i++;
            return findMax(array, i);
        }
        if (array[i] <= max) {
            i++;
            return findMax(array, i);
        }
        return findMax(array, i);
    }
}
