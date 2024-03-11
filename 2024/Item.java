import java.util.Scanner;

public class Item {
    private Item next;
    private Item previous;
    private Object data;

    public Item(Object data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }

    public Item getPrevious() {
        return previous;
    }

    public void setPrevious(Item previous) {
        this.previous = previous;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item head = null;
        Item tail = null;

        System.out.println("Enter data items (type 'quit' to stop):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            Item newItem = new Item(input);
            if (head == null) {
                head = newItem;
                tail = newItem;
            } else {
                newItem.setPrevious(tail);
                tail.setNext(newItem);
                tail = newItem;
            }
        }

        // Printing data from front to back
        System.out.println("Printing data from front to back:");
        Item current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }

        // Printing data from back to front
        System.out.println("\nPrinting data from back to front:");
        current = tail;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getPrevious();
        }
    }
}
