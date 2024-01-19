import java.util.Scanner;

public class scanner22 {


        public static void main(String[] args) {
            try {
                // Input an integer
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please enter an integer: ");
                int userInt = scanner.nextInt();
                System.out.println("Thank you for inputting the int. I read " + userInt);
    
                // Input a float
                System.out.print("Please enter a float: ");
                float userFloat = scanner.nextFloat();
                System.out.println("Thank you for inputting the float. I read " + userFloat);
    
                // Input a line of text
                scanner.nextLine(); // Consume the newline character
                System.out.print("Please enter a line of text: ");
                String userLine = scanner.nextLine();
                System.out.println("Thank you for inputting the line. I read '" + userLine + "'");
    
                // Input full name
                System.out.print("Please enter your first and last name: ");
                String fullName = scanner.nextLine();
    
                // Attempt to split into first and last names
                String[] names = fullName.split("\\s");
                if (names.length >= 2) {
                    String firstName = names[0];
                    String lastName = String.join(" ", Arrays.copyOfRange(names, 1, names.length));
     
}
            } finally {}
        }
    }