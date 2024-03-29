package dz6;

import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        System.out.println("Введите строки (для завершения введите 'end'):");

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            result.append(input).append(" ");
            input = scanner.nextLine();
        }

        System.out.println("Результат:");
        System.out.println(result.toString().trim());
    }
}