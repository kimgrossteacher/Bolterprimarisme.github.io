public class rabbitprint {
    public static void main(String[] args) {
        rabbit1 rabbit1 = new rabbit1("Bugs", 3);
        rabbit1 rabbit2 = new rabbit1("Thumper", 2);

        // Print the first Rabbit object
        System.out.println("First Rabbit Object:");
        System.out.println(rabbit1);

        // Print the second Rabbit object
        System.out.println("Second Rabbit Object:");
        System.out.println(rabbit2);
    }
}