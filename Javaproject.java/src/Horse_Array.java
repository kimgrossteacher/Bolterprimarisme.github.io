import java.util.ArrayList;

public class Horse_Array {
    public static void main(String[] args) { 
        //this array list creates a way to print out many horses all under Horse4
        ArrayList horselist=new ArrayList ();
        //this is our object identifier and our first object
        Object horse4=new Horse("reddy", 10, "red");
        horselist.add(horse4);
        // our secound object
        horse4=new Horse("bobby", 15, "grey");
        horselist.add(horse4);
         // our third object
        horse4=new Horse("gluestick", 32, "blue");
        horselist.add(horse4);
         // our fourth object
        horse4=new Horse("crusty", 86, "blackishgrey");
        horselist.add(horse4);
        //the printer for our array list.
        for(int i=0;i<horselist.size() ;i++) { 
        horse4=horselist.get(i);
        System.out.println(horse4);
}
    }
}