import java.util.UUID;

class Calculator {
    Calculator() {
    }

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    int fibonacciNumberFinder(int n) {
        if (n <= 0) return 0;
        if (n == 1 || n == 2) return 1;

        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    String intToBinaryNumber(int number) {
        return Integer.toBinaryString(number);
    }

    String createUniqueID(String n) {
        return n + UUID.randomUUID().toString().replace("-", "");
    }
}
