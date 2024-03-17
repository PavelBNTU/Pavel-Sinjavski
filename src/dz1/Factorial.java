package dz1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для расчёта факториала: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определен.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("Факториал числа " + n + " равен: " + factorial);
        }

        scanner.close();
    }

    static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
