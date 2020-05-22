package lekcja10;

import java.util.Scanner;

public class Calculator {

    public void divideFromCommandLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = scanner.nextInt();
        System.out.println("Enter B: ");
        int b = scanner.nextInt();
        System.out.println("Result: ");
        System.out.println(divide(a, b));
    }

    public int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
}
