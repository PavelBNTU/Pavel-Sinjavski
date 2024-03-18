package dz1;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для расчёта: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Число меньше 1 не подходит.");
        } else {
            long result = multiplyDigits(n);
            System.out.println("Результат умножения цифр числа " + n + " равен: " + result);
        }

        scanner.close();
    }

    static long multiplyDigits(int number) {
        long result = 1;
        while (number != 0) {
            int digit = number % 10;
            if (digit != 0) {
                result = result * digit;
            }
            number = number / 10;
        }
        return result;
    }
}
