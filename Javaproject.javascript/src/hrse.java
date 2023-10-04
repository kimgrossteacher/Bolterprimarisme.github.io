
// written by Stephen D 
// Done for Software Devolopment
// This is for Objects week 6
public class hrse {
     public class  Horse {
            // Instance variables
            private String name;
            private int age;
            private String color;
        
            // Constructor
            public Horse(String name, int age, String color) {
                this.name = name;
                this.age = age;
                this.color = color;
            }
        
            // Getter methods
            public String getName() {
                return name;
            }
        
            public int getAge() {
                return age;
            }
        
            public String getColor() {
                return color;
            }
        
            // Setter methods
            public void setName(String name) {
                this.name = name;
            }
        
            public void setAge(int age) {
                this.age = age;
            }
        
            public void setColor(String color) {
                this.color = color;
            }
        
            // Method to make the horse gallop
            public void gallop() {
                System.out.println(name + " is galloping!");
            }
        
            // Method to display horse information
            public void displayInfo() {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age + " years");
                System.out.println("Color: " + color);
            }
        }
    
    
    public static void main(String[] args){
    Horse horse1=new Horse("horse1", 10, "red");
    
    Horse horse2=new Horse("horse2", 10, "red");
    
    Horse horse3=new Horse("horse3", 10, "red");
    System.out.println(horse1);  
    System.out.println(horse2);  
    System.out.println(horse3);  
    }
}