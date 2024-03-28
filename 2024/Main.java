/*
Error filled file created by
Kimg@techtrepacademy.com
for my java class to learn troubleshooting on
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("hello everybody");
        System.out.println("am I doing this correctly");
        for (int i = 0; i < 10; i++) {
            System.out.println("the number i is " + i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("the new number i is " + i);
        }

        int i = 0; // Define 'i' outside the loop
        if (i == 0) {
            System.out.println("i is equal to zero");
        } else {
            System.out.println("i is not equal to zero");
        }
    }
}