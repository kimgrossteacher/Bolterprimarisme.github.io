import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadStudentDataFromFile {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "stephen.txt";

        try {
            // Create a Scanner to read from the file
            Scanner scanner = new Scanner(new File(filePath));

            // Read and print each line of the file until there are no more lines
            while (scanner.hasNextLine()) {
                String studentData = scanner.nextLine();
                System.out.println(studentData);
            }

            // Close the scanner
            scanner.close();

        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.err.println("File not found: " + filePath);
            e.printStackTrace();
        }
    }
}