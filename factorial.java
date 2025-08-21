import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // Use long to handle larger factorials
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Equivalent to factorial = factorial * i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}