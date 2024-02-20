import java.io.*;
import java.util.*;

public class UserDataInputOutput {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Create a FileWriter object to write to a text file
            FileWriter fw = new FileWriter("userdata.txt");

            List<Integer> zipCodes = new ArrayList<>();

            for (int i = 1; i <= 5; i++) {
                // Prompt for user data
                System.out.println("Enter data for user " + i + ":");
                fw.write("User " + i + ":\n");

                // Loop through different data items
                String[] dataItems = {"Name", "Address", "City", "State", "Zip", "Phone Number"};
                for (String item : dataItems) {
                    System.out.print(item + ": ");
                    String userInput = br.readLine();
                    if (item.equals("Zip")) {
                        try {
                            int zip = Integer.parseInt(userInput);
                            zipCodes.add(zip);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input for Zip code. Please enter a number.");
                            fw.write(item + ": Invalid input\n");
                            continue;
                        }
                    }
                    fw.write(item + ": " + userInput + "\n");
                }
            }

            // Close FileWriter
            fw.close();

            // Read the saved text file and print data
            BufferedReader fileReader = new BufferedReader(new FileReader("userdata.txt"));
            String line;
            System.out.println("\n--- User Data ---");
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();

            // Calculate and print the most common zip code (mode)
            if (!zipCodes.isEmpty()) {
                int mode = calculateMode(zipCodes);
                System.out.println("\nMost common Zip code: " + mode);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Method to calculate mode (most common element) from a list of integers
    private static int calculateMode(List<Integer> list) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = 0;

        for (int num : list) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            }
        }

        return mode;
    }
}
