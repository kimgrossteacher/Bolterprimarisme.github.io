import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentInfoWriter {
    public static void main(String[] args) {
        try {
            // Create a FileWriter with the specified file name
            FileWriter fileWriter = new FileWriter("stephen.txt");
            
            // Create a BufferedWriter to efficiently write characters to the file
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            // Create a Scanner to read user input
            Scanner scanner = new Scanner(System.in);
            
            // Ask for and input the first and last name
            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();
            
            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();
            
            // Ask for and input the year or grade
            System.out.print("Enter your year or grade: ");
            String year = scanner.nextLine();
            
            // Ask for and input the name of the school
            System.out.print("Enter the name of your school: ");
            String schoolName = scanner.nextLine();
            
            // Write the information to the file
            bufferedWriter.write(firstName);
            bufferedWriter.newLine(); // Move to the next line
            bufferedWriter.write(lastName);
            bufferedWriter.newLine();
            bufferedWriter.write(year);
            bufferedWriter.newLine();
            bufferedWriter.write(schoolName);
            
            // Close the resources
            bufferedWriter.close();
            fileWriter.close();
            
            System.out.println("Student information has been written to stephen.txt.");
            
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
