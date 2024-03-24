package dz4;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] orderedArray = new int[1000000]; // Создаем упорядоченный массив размером 1_000_000 элементов

        for (int i = 0; i < 1000000; i++) {
            orderedArray[i] = 1000000 + i; // Заполняем массив значениями от 1_000_000 до 1_999_999
        }

        // Для примера выводим первые и последние элементы массива
        System.out.println("First element: " + orderedArray[0]);
        System.out.println("Last element: " + orderedArray[999999]);

        Random random = new Random();
        int randomIndex = random.nextInt(100001);
        int randomInt = random.nextInt(1_000_000,2_000_000);
        System.out.println("Random element: " + randomInt);

    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Элемент не найден
    }
}
