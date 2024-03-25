import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Demonstrate stack and queue operations with user input
        System.out.println("PART 1: Stack and Queue Operations\n");

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Enter integers to add to the stack and queue (-1 to stop):");
        int input;
        while ((input = scanner.nextInt()) != -1) {
            stack.push(input); // Add to stack
            queue.offer(input); // Add to queue
        }

        System.out.println("\nData in Queue (FIFO order):");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
