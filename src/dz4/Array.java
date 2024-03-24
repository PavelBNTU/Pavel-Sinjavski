package dz4;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        bublleSort(array);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальный и конечный индексы (разделенные пробелом): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        if (start >= 0 && end < array.length && start <= end) {
            System.out.println("Часть массива:");
            for (int i = start; i <= end; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Введены некорректные индексы");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;           }
        }
    }

    private static void bublleSort(int[] array) {
    }
}
