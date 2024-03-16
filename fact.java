package Dz1;
import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Факториал числа ");
        int n = scanner.nextInt();
        fact.calculateFactorial(n);
    }

    static int calcuсщlateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}