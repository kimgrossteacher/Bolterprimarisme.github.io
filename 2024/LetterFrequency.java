import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LetterFrequency {

    public static void main(String[] args) {
        // Define file path
        String filePath = "letter.txt";

        // Initialize variables to store total frequency and percentage
        int totalFrequency = 0;
        double totalPercentage = 0.0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip header line
            br.readLine();

            // Read each line of the file
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into letter, frequency, and percentage
                String[] parts = line.split(",");
                String letter = parts[0].trim();
                int frequency = Integer.parseInt(parts[1].trim());
                double percentage = Double.parseDouble(parts[2].trim());

                // Add frequency to total
                totalFrequency += frequency;

                // Add percentage to total
                totalPercentage += percentage;

                // Print letter data
                System.out.printf("%s\tFrequency: %d\tPercentage: %.1f%%\n", letter, frequency, percentage);
            }

            // Calculate average frequency
            double averageFrequency = totalFrequency / 26.0;

            // Print total line
            System.out.println("\nTotal:");
            System.out.printf("Average Frequency: %.2f\n", averageFrequency);
            System.out.printf("Total Percentage: %.1f%%\n", totalPercentage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}