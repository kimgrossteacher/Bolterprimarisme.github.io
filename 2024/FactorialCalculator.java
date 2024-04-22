public class FactorialCalculator {

    public static void main(String[] args) {
        int number = 5; // Change this number to calculate factorial for a different number
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            System.out.println("Debug: i = " + i + ", result = " + result); // Debug print statement
        }
        return result;
    }
}
