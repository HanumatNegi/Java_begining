import java.util.Scanner;

// Custom exception classes
class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message) {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}

class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class Calculator_with_exception {

    // Validation method
    public static void exceptionHandling(int a, int b, String operation) throws Exception {
        if ((a == 8 && b == 9) || (a == 9 && b == 8))
            throw new InvalidInputException("Invalid combination of inputs: 8 and 9 together.");

        if (a > 100000 || b > 100000)
            throw new MaxInputException("Input exceeds the maximum allowed value of 100000.");

        if ("*".equals(operation) && (a > 7000 || b > 7000))
            throw new MaxMultiplierReachedException("Multiplication inputs must be <= 7000.");

        if ("/".equals(operation) && b == 0)
            throw new CannotDivideByZeroException("Cannot divide by zero.");
    }


    // Operation methods using internal try-catch
    public static void add(int a, int b) {
        try {
            exceptionHandling(a, b, "+");
            System.out.println("Result: " + (a + b));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void subtract(int a, int b) {
        try {
            exceptionHandling(a, b, "-");
            System.out.println("Result: " + (a - b));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void multiply(int a, int b) {
        try {
            exceptionHandling(a, b, "*");
            System.out.println("Result: " + (a * b));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void divide(int a, int b) {
        try {
            exceptionHandling(a, b, "/");
            System.out.println("Result: " + (a / b));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------- Custom Calculator -------------------");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Choose operation (+, -, *, /): ");
        String op = scanner.next();

        switch (op) {
            case "+":
                add(a, b);
                break;
            case "-":
                subtract(a, b);
                break;
            case "*":
                multiply(a, b);
                break;
            case "/":
                divide(a, b);
                break;
            default:
                System.out.println("Invalid operation selected.");
        }

        scanner.close();
    }
}
