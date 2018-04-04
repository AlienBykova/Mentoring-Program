package homeWorks.module_3;

import java.util.NoSuchElementException;
import java.util.Random;

public class OperationsWithNumbersAndArrays {

    public void fillArrayWithRandomValues(int[] arr) {
        Random random = new Random();
        for (int j = 0; j < arr.length; j++) {
            arr[j] = random.nextInt(9);
        }
    }

    public void printNumbers() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i; j < 7; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public void bubbleSort(int[] intArray) {
        for (int j = 0; j < intArray.length - 1; j++) {
            for (int k = j + 1; k < intArray.length; k++) {
                if (intArray[j] > intArray[k]) {
                    int temp = intArray[k];
                    intArray[k] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

    public int binarySearch(int[] arr, int key) {
        int firstIndex = 0;
        int lastIndex = arr.length;
        int middleIndex;
        while (firstIndex < lastIndex) {
            middleIndex = (firstIndex + lastIndex) / 2;
            if (key == arr[middleIndex]) return middleIndex;
            else if (key > arr[middleIndex]) {
                firstIndex = middleIndex + 1;
            } else if (key < arr[middleIndex]) {
                lastIndex = middleIndex - 1;
            }
        }
        throw new NoSuchElementException(String.format("There is no such element %s", key));
    }

    public void printNumberType(int number) {
        if (number % 2 == 0) System.out.println("Even number");
        else System.out.println("Odd number");
    }

    public void defineNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                throw new NoSuchElementException(String.format("There is no such number %s. Please provide number in range 1 - 9.", number));
        }
    }
}
