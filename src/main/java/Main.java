import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Calculator Program!");
        System.out.println("Type 'help' to see the list of available commands.");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (parts.length < 1) {
                System.out.println("Invalid input");
                continue;
            }

            String command = parts[0];

            if (command.equals("help")) {
                System.out.println("Available commands:");
                System.out.println("add [num1] [num2] - Adds two numbers");
                System.out.println("subtract [num1] [num2] - Subtracts two numbers");
                System.out.println("multiply [num1] [num2] - Multiplies two numbers");
                System.out.println("divide [num1] [num2] - Divides two numbers");
                System.out.println("fibonacci [num] - Finds the nth Fibonacci number");
                System.out.println("binary [num] - Converts a number to binary");
                continue;
            }

            if (parts.length < 2) {
                System.out.println("Invalid input");
                continue;
            }

            int num1 = Integer.parseInt(parts[1]);
            int num2 = parts.length > 2 ? Integer.parseInt(parts[2]) : 0;

            switch (command) {
                case "add":
                    System.out.println(calculator.add(num1, num2));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(num1, num2));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(num1, num2));
                    break;
                case "divide":
                    try {
                        System.out.println(calculator.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(num1));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(num1));
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
        scanner.close();
    }
}
