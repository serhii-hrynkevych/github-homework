package hrynkevych.serhii;

public class SumOfArrayElements {
    static int sum = 0;

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; //задаю массив, где сумма элементов = 15
        sum = sum(array, array.length - 1); //объявляю переменную для суммы массива, и вызываю метод sum,
        // в который передаю массив и значение длины масива минус единица (ведь нам же нужны номера элементов массива)
        System.out.println(sum); //вывожу в консоль результат
    }

    private static int sum(int[] array, int arrayLengt) { //метод sum который принимает массив и значение последнего
        // элемента массива
        if (arrayLengt == 0) { //если номер элемента массива 0 - значит заканчивает подсчет
            return sum = array[0]; //возвращаем значение 0 элемента массива
        } else { //если же элемент массива не 0, то...
            return sum = array[arrayLengt] + sum(array, arrayLengt - 1); //к элементу массива №arrayLengt
            //прибавляем опять вызваный метод sum, только берез элемент массива на один меньше, чем только что взятый
        }
    }
}
