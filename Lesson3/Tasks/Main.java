import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        Task 1: insetSort difficulty = O(n^2)
        int[] a = {7, 9, 2, 6, 3, 4, 5, 1, 10, 8};
        System.out.println(Arrays.toString(a));
        insertSort(a);
        System.out.println(Arrays.toString(a));

//        Task 2: Fibonacci numbers difficulty = O(n)
        System.out.println(Arrays.toString(fibonacciNumbers(0, 1, 10)));

    }

    public static void insertSort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            for (int i = j - 1; i >= 0; i--) {
                if (a[i] > key) {
                    a[i + 1] = a[i];
                    a[i] = key;
                }
            }
        }
    }

    public static int[] fibonacciNumbers(int first, int second, int length) {
        int[] numbers = new int[length];
        numbers[0] = first;
        numbers[1] = second;
        for (int i = 2; i < length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers;
    }
}

