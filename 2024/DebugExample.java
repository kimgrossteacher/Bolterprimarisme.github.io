public class DebugExample {
    // Debugging toggle
    private static final boolean DEBUG_ENABLED = true;

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 7;
        
        // Debugging print statement to show initial state
        if (DEBUG_ENABLED) {
            System.out.println("Target value: " + target);
        }

        boolean found = false;
        for (int num : numbers) {
            // Debugging print statement to show each iteration
            if (DEBUG_ENABLED) {
                System.out.println("Checking number: " + num);
            }

            if (num == target) {
                found = true;
                break;
            }
        }

        // Debugging print statement to show final result
        if (DEBUG_ENABLED) {
            if (found) {
                System.out.println("Target found!");
            } else {
                System.out.println("Target not found!");
            }
        }
    }
}
