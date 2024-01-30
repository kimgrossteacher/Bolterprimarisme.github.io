import java.util.Scanner;

public class WordBreakdown {
    public static void main(String[] args) {
        // Hard-coded string
        String testString = "the quick Brown Fox Jumped over the lazy dog";

        // Break down and print words from the hard-coded string
        System.out.println("Breaking down the hard-coded string:");
        int wordCountHardCoded = printWords(testString);
        System.out.println("Total number of words: " + wordCountHardCoded);

        // Get user input and break down the input string
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a line of text:");
        String userInput = scanner.nextLine();

        System.out.println("Breaking down the user input:");
        int wordCountUserInput = printWords(userInput);
        System.out.println("Total number of words: " + wordCountUserInput);

        // Close the scanner
        scanner.close();
    }

    private static int printWords(String input) {
        // Split the input string into words
        String[] words = input.split("\\s+");

        // Print each word on a separate line
        for (String word : words) {
            System.out.println(word);
        }

        // Return the total number of words
        return words.length;
    }
}
