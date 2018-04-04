package homeWorks.module_3;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        OperationsWithNumbersAndArrays operationsWithNumbersAndArrays = new OperationsWithNumbersAndArrays();
        int[] arr = new int[10];

        operationsWithNumbersAndArrays.printNumbers();

        operationsWithNumbersAndArrays.fillArrayWithRandomValues(arr);
        System.out.println(Arrays.toString(arr));
        operationsWithNumbersAndArrays.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(operationsWithNumbersAndArrays.binarySearch(arr, 0));

        System.out.print("Enter some integer: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        operationsWithNumbersAndArrays.printNumberType(number);

        operationsWithNumbersAndArrays.defineNumber(number);
    }
}
