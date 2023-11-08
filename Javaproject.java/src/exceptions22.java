public class exceptions22 {
        
        public static void main(String[] args) {
            try {
                // Error 1 ArithmeticException
                int result = divide(10, 0);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error 1: " + e.getMessage());
            }
            
            try {
                // Error 2 ArrayIndexOutOfBoundsException
                int[] arr = {1, 2, 3};
                int value = arr[5];
                System.out.println("Value: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error 2: " + e.getMessage());
            }
            
            try {
                // Error 3 NullPointerException
                String text = null;
                int length = text.length();
                System.out.println("Length: " + length);
            } catch (NullPointerException e) {
                System.out.println("Error 3: " + e.getMessage());
            }
        }
        // divides the program
        public static int divide(int dividend, int divisor) {
            return dividend / divisor;
        }
    }

