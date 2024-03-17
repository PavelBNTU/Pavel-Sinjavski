package dz1;

public class Solution {
    public static void main(String[] args) {
        int size = 10; // Размер таблицы умножения

        printMultiplicationTable(size);
    }

    static void printMultiplicationTable(int size) {
        // Вывод заголовка таблицы
        System.out.print("   |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n------------------------");

        // Вывод тела таблицы
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
